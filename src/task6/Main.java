package task6;

public class Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        String str = null;
        System.out.println(str.length());
    }
}


