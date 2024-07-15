package task15;

import java.util.Objects;
import java.util.function.Consumer;


public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(1);
        String s = pair.getSecond("hello");

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(secondValue, pair.secondValue);
        }

    public int hashCod() {
        return Objects.hash(firstValue, secondValue);
    }


    public void ifPresent() {
       ifPresent(null);
    }

    public void ifPresent(Consumer<? super X, ? super Y> consumer) {
    }
}