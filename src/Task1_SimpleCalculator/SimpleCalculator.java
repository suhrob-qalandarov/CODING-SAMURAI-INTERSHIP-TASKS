package Task1_SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {

    private static final Scanner scanner = new Scanner(System.in);
    private static final MathService mathService = new MathServiceImpl();

    public static void main(String[] args) {
        writeInfoMessage();

        while (true){
            int chosenOperation = mainMenu();

            if (checkLogOut(chosenOperation)) break;

            if (!checkOperation(chosenOperation)) continue;

            writeChosenOptionMenu(chosenOperation);

            toSolve(chosenOperation);
        }
    }

    private static void writeInfoMessage() {
        System.out.println("""
                
                    ------------------ INFO -------------------
                     This calculator would be able to add,
                     subtract, multiply and divide two numbers.""");
    }

    private static int mainMenu() {
        return ScannerUtil.getIntDigit(SimpleCalculator.scanner,"""
                        -------------------------------------------
                         1 - Add
                         2 - Subtract
                         3 - Multiply
                         4 - Divide
                        -------------------------------------------
                         0 - Exit
                         Choose:\s"""
        );
    }

    private static boolean checkLogOut(int chosenOperation) {
        if (chosenOperation == 0) {
            System.out.println("""
                            
                            -----------------
                             You logged out!
                            -----------------"""
            );
            return true;
        }
        return false;
    }

    private static void writeChosenOptionMenu(int chosenOperation) {
        String chosenOption = chosenOperation == 1 ? "Add"
                : chosenOperation == 2 ? "Subtract"
                : chosenOperation == 3 ? "Multiply"
                : "Divide";

        System.out.printf("""
                        
                        --------------------------
                         Chosen option: %s
                        --------------------------""", chosenOption
        );
    }

    private static void toSolve(int chosenOperation) {
        double firstNumber, secondNumber, solution = 0;

        firstNumber = ScannerUtil.getDoubleDigit(scanner, "\n Enter first number: ");
        secondNumber = ScannerUtil.getDoubleDigit(scanner, " Enter second number: ");

        try {
            switch (chosenOperation) {
                case 1 -> solution = mathService.add(firstNumber, secondNumber);
                case 2 -> solution = mathService.subtract(firstNumber, secondNumber);
                case 3 -> solution = mathService.multiply(firstNumber, secondNumber);
                case 4 -> solution = mathService.divide(firstNumber, secondNumber);
            }

            System.out.printf("""
                            --
                             Result is: %s
                            ---------------------------
                            
                            """, solution
            );
        } catch (ArithmeticException e) {
            System.out.println(" ⚠️ Error: " + e.getMessage() + "\n");
        }
    }

    private static boolean checkOperation(int chosenOperation) {
        if (chosenOperation < 1 || chosenOperation > 4) {
            System.out.println("""
                            -!-
                            ⚠️ Invalid option! Please choose between 0–4.
                            -!-
                            """
            );
            return false;
        }
        return true;
    }
}