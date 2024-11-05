package pushpak58java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperationStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(400, 288, 3, 4, 42, 23, 4, 24, 4, 56, 34, 2, 43);
        List<Integer> fileterlist  = list.stream()
                .filter(x ->x%2 ==0)
                .map(x->x/2)
                .distinct()
                .sorted((a,b) ->(b-a))
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(fileterlist);

        List<Integer> collect = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 10)
                .distinct()
                .sorted()
                .peek(x -> System.out.println(x))
                .collect((Collectors.toList()));


    }
}
