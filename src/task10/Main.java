package task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String pathToFile = args[0]; // "/home/user/file.txt"
        try {
            String s = readFile(pathToFile);
            System.out.println(s);
        } catch (IOException e) {
            if (e instanceof java.io.FileNotFoundException) {
                System.out.println("файл " + pathToFile + " не найден");
            } else {
                System.out.println("произошла ошибка при чтении файла " + pathToFile);
            }
        }

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