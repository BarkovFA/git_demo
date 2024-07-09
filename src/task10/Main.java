package task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/user/file.txt");
        if (file.exists() && file.isDirectory()) {
            System.out.println("файл " +  "/home/user/file.txt" + " не найден");
        } else System.out.println("произошла ошибка при чтении файла " +  "/home/user/file.txt");
    }

    public static String readFile(String pathToFile) throws IOException {
        FileReader fileReader = new FileReader(pathToFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder stringBuilder = new StringBuilder();
        String currentLine;
        while ((currentLine = bufferedReader.readLine()) != null) {
            stringBuilder.append(currentLine);
            stringBuilder.append("\n");
        }
        bufferedReader.close();

        return stringBuilder.toString();
    }
}