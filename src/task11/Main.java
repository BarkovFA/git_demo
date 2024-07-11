package task11;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        byte [] lst = new byte[] {48, 49, 50, 51};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(lst);
        String str = readAsString(inputStream, StandardCharsets.US_ASCII);
        System.out.println(str);
    }


    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        int num;
        try (Reader reader = new InputStreamReader(inputStream, charset)) {
            StringWriter stringWriter = new StringWriter();
            while ((num = reader.read()) != -1) {
                stringWriter.write(num);
            }
            return stringWriter.toString();
        }
    }
}
