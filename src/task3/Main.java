package task3;

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.2, 2.0);
        ComplexNumber c2 = new ComplexNumber(5.2, 7.0);
        System.out.println("First complex number: " + c1);
        System.out.println("Second complex number: " + c2);
        c1.add(c2);
        System.out.println("Summa complex number: " + c1);
        c1.other(c2);
        System.out.println("Proizvedenie complex number: " + c1);
    }
}

