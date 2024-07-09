package task12;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        double sum = 0.0;
        while (input.hasNext()) {
            if (input.hasNextDouble()) {
                sum += input.nextDouble();
            } else {
                input.next();
            }
        }
        System.out.printf(Locale.ENGLISH,"%.6f", sum);
    }
}
