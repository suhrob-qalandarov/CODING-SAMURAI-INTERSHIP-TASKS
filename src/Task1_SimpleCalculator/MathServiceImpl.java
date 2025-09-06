package Task1_SimpleCalculator;

public class MathServiceImpl implements MathService {

    @Override
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            System.out.println("""
                
                -!-
                  Division rules:
                 - a ÷ 0 (a ≠ 0) → Undefined
                 - 0 ÷ 0 → Indeterminate
                -!-"""
            );

            if (firstNumber == 0) {
                throw new ArithmeticException("Indeterminate form: 0 ÷ 0");
            } else {
                throw new ArithmeticException("Undefined: a ÷ 0 when a ≠ 0");
            }
        }
        return firstNumber / secondNumber;
    }
}
