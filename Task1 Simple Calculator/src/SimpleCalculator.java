import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chosenOperation;
        double firstNumber, secondNumber;
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

        }
    }
}