package learn;

//use BiFunction when needed
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class A {
    public static void main(String[] args) {
//    BiFunction<Integer,Integer,Integer> fun = (a, b)-> a*b ;
//    Integer result = fun.apply(2,9);
//        System.out.println(result);

//        BiFunction<Integer, Integer, Double> combiner = (a, b)->Math.pow(a,b);
//        Double result2 = combiner.apply(1,9);
//        System.out.println(result2);
//    }

        BiFunction<Integer, Integer, List<Integer>> combiner = (a, b) -> Arrays.asList(a);
        List<Integer> list = combiner.apply(4, 5);
        System.out.println(list);

    }
}
