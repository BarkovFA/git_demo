package task20;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        cycleGrayCode(2).limit(10).forEach(System.out::println);
        cycleGrayCode(5).limit(15).forEach(System.out::println);
    }

    public static Stream<Integer> cycleGrayCode(int n) {
        if (n < 1 || n > 16) {
            throw new IllegalArgumentException("out of the range");
        }

        int num = 1 << n;

        return IntStream.iterate(0, i -> (i + 1) % num)
                .map(i -> i ^ (i >> 1))
                .boxed();
    }
}




//        int [] lstGray = new int[num];
//        for (int i = 0; i < num; i++) {
//            lstGray[i] = i ^ (i >> 1);
//        }
//
//        return  IntStream.iterate(0, i -> (i+1) % num)
//                .mapToObj(i -> lstGray[i]);
//    }
//
//}