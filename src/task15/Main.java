import java.util.Objects;

public class Main {
    public static void main(String[] args) {

    }
}

class Pair <X, Y> {

    private X firstValue;
    private Y secondValue;

    private Pair(X x, Y y) {
        firstValue = x;
        secondValue = y;
    }

    public static <X, Y> Pair <X, Y> of (X x, Y y) {
        return new Pair<>(x, y);
    }


    public X getFirst(X x) {
        return firstValue;
    }

    public Y getSecond(Y y) {
        return secondValue;
    }


    public void equals() {

    }

    public int hashCod() {
        return ;


    }

}