package task7;

public class Main {
    public static void main(String[] args) {
        getSeason(-2);

    }


    static String getSeason(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                throw new IllegalArgumentException("monthNumber" +monthNumber + " is invalid, month number should be between 1..12");
        }
        return null;
    }
}


