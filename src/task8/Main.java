package task8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        throwCheckedException();
    }

    public static void throwCheckedException()  throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\barkov_f\\Desktop\\test.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
