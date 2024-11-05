package pushpak58java8;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class Operator {
    public static void main(String[] args) {
        //UnaryOperator in Java 8
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));

    //BinaryOperator in Java 8
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 20));

    }
}
