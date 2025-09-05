package Task1_SimpleCalculator;

import java.util.Scanner;

public interface ScannerUtil {
    static int getIntDigit(Scanner scanner, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("""
                        
                        -!-
                         ⚠️ Invalid input! Please enter a valid integer.
                        -!-
                        """);
            }
        }
    }

    static double getDoubleDigit(Scanner scanner, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("""
                        
                        -!-
                         ⚠️ Invalid input! Please enter a valid number.
                        -!-
                        """);
            }
        }
    }
}
