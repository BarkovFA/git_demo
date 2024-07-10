package task7;

public class CheckSeasons {
    public static String getSeason(int numMonth) {
        if ((numMonth < 1) || (numMonth > 12)) {
            throw new IllegalArgumentException("monthNumber" + numMonth + " is invalid, month number should be between 1..12");
        }
        switch (numMonth) {
            case 1:
            case 2:
            case 12:
                return "Зима";
            case 3:
            case 4:
            case 5:
                return "Осень";
            case 6:
            case 7:
            case 8:
                return "Лето";
            case 9:
            case 10:
            case 11:
                return "Весна";
            default:
                throw new IllegalArgumentException("WTF");
        }
    }
}

class Main extends CheckSeasons{
    public static void main(String[] args) {
        try {
            System.out.println(getSeason(2));
            System.out.println(getSeason(3));
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }
    }
}
