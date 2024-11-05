package pushpak58java8;

import java.util.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StrimApi {
    public static void main(String[] args) {
        //1
        List<String> list = Arrays.asList("pushpak","kunal","akash");
        Stream<String> myStrem = list.stream();
        myStrem.forEach(System.out::println);

        //2
        String[] array = {"apple","banana","Cherry"};
        Stream<String> Strem  = Arrays.stream(array);
        Strem.map(String::toUpperCase).forEach(System.out::println);

        //3
        Stream<Integer> intstrem = Stream.of(1,2,3,4,5);
        intstrem.forEach(x -> System.out.println(x));

        //4
        Stream<Integer> limit = Stream.iterate(0,n ->n+1).limit(100);
        limit.forEach(System.out::println);

        //5
        Stream<Integer> linit1 = Stream.generate(() -> (int)Math.random()*100).limit(10);








    }
}
