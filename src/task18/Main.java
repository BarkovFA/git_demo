package task18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        Reader reader = new InputStreamReader(System.in, charset);
        BufferedReader bufferedReader = new BufferedReader(reader);

        Stream<String> stream = bufferedReader.lines();
        Map<String, Long> collect =
                stream.map(line -> line.split("[^\\pL\\pM\\p{Nd}\\p{Nl}\\p{Pc}[\\p{InEnclosedAlphanumerics}&&\\p{So}]]"))
                        .flatMap(Arrays::stream)
                        .map(String::toLowerCase)
                        //.forEach(System.out::println);
                        .collect(Collectors.groupingBy(o -> o, Collectors.counting()));
        //.flatMap(Map::entrySet().stream())

        collect.entrySet().stream().sorted((e1, e2) -> {
                    int comp = e2.getValue().compareTo(e1.getValue());
                    if (comp == 0) {
                        return -e2.getKey().compareTo(e1.getKey());
                    }
                    return comp;
                })
                .limit(11)
                .forEach(x -> System.out.println(x.getKey()));

        System.out.println(collect);
    }
}



//    public static void main(String[] args) {
//        HashMap<Integer, String> list = new HashMap<>();
//        (new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8)))
//                .lines()
//                .flatMap(l -> Stream.of(l.split("[\\p{Punct}\\s]+")))
//                .map(w -> w.toLowerCase())
//                .forEach(w -> {
//                    if (list.containsKey(w)) list.put(Integer.valueOf(w), list.get(w) + 1);
//                    else list.put(1, w);
//                });
//        list.entrySet()
//                .stream()
//                .sorted((e1, e2) -> {
//                    if (e1.getValue() == e2.getValue()) return e1.getKey().compareTo(e2.getKey());
//                    else return e2.getValue().compareTo(e1.getValue());
//                })
//                .limit(10)
//                .forEach(e -> System.out.println(e.getKey()));
//    }
//}