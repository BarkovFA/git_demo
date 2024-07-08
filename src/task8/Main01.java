package task8;

import java.io.IOException;

public class Main01 {
    public static void main(String[] args) {
        try {
            throwCheckedException();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void throwCheckedException() throws IOException {
        throw new IOException("Checked exception");
    }
}
