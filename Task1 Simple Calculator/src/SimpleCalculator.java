import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathService mathService = new MathServiceImpl();
        int chosenOperation;
        double firstNumber, secondNumber, solution = 0;

        System.out.println("""
                
                    ------------------ INFO -------------------
                     This calculator would be able to add,
                     subtract, multiply and divide two numbers.""");

        while (true){
            System.out.print("""
                    -------------------------------------------
                     1 - Add
                     2 - Subtract
                     3 - Multiply
                     4 - Divide
                    -------------------------------------------
                     0 - Exit
                     Choose:\s"""
            );
            chosenOperation = Integer.parseInt(scanner.nextLine());

            if (chosenOperation == 0) {
                System.out.println("""
                        -----------------
                         You logged out!
                        -----------------"""
                );
                return;
            }

            String chosenOption = (chosenOperation == 1) ? "Add"
                    : (chosenOperation == 2) ? "Subtract"
                    : (chosenOperation == 3) ? "Multiply"
                    : (chosenOperation == 4) ? "Divide"
                    : "Unknown";

            System.out.printf("""
                    
                    --------------------------
                     Chosen option: %s
                    --------------------------
                     Enter first number:\s""", chosenOption
            );
            firstNumber = Double.parseDouble(scanner.nextLine());
            System.out.print(" Enter second number: ");
            secondNumber = Double.parseDouble(scanner.nextLine());

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
    }
}