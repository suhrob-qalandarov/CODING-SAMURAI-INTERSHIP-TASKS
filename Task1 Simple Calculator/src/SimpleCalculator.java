import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathService mathService = new MathServiceImpl();
        int chosenOperation;
        double firstNumber, secondNumber, solution = 0;
        while (true){
            System.out.println("""
                    ------------------ INFO -------------------
                     This calculator would be able to add,
                     subtract, multiply and divide two numbers.
                    -------------------------------------------
                     1 - Add
                     2 - Subtract
                     3 - Multiply
                     4 - Divide
                    -------------------------------------------
                     Choose:\s"""
            );

            chosenOperation = scanner.nextInt();

            System.out.print(" Enter first number: ");
            firstNumber = scanner.nextDouble();
            System.out.print(" Enter second number: ");
            secondNumber = scanner.nextDouble();

            switch (chosenOperation) {
                case 1 -> solution = mathService.add(firstNumber, secondNumber);
                case 2 -> solution = mathService.subtract(firstNumber, secondNumber);
                case 3 -> solution = mathService.multiply(firstNumber, secondNumber);
                case 4 -> solution = mathService.divide(firstNumber, secondNumber);
            }

            System.out.printf("""
                        
                        -------------------------------------------
                         Result is: %s
                        
                        %n""", solution);
        }
    }
}