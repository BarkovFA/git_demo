package test11;

import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) throws IOException {
        byte [] lst = new byte[] {48, 49, 50, 51};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(lst);
        String str = readAsString(inputStream, Charset.forName("ASCII"));
        System.out.println(str);
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        String value;
        int num;
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter stringBuffer = new StringWriter();
        while ((num = reader.read()) != -1) {
            stringBuffer.write(num);
        }
        value = stringBuffer.toString();
        return value;
    }
}