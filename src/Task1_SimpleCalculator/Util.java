package Task1_SimpleCalculator;

import java.util.Scanner;

public interface Util {
    static int getIntDigit(String msg) {
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static double getDoubleDigit(String msg) {
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
