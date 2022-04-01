package function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        //1.turn String into int, Integer.parseInt();
        convert("11", (String s) -> {
            return Integer.parseInt(s);
        });
        //improve
        convert("11", s -> Integer.parseInt(s));
        //improve
        convert("11",  Integer::parseInt);

        // 2.turn integer into string. String.valueOf();
        convertInt2String(9, e -> String.valueOf(e*e));
        convertInt2String(9,  String::valueOf);// if no opeations
        //3. turn a string into an int and do operations and then turn it to a string again
        convert("10",e->Integer.parseInt(e), e->String.valueOf(e+10));
    }


    private static void  convert(String s, Function<String, Integer> fun) {
        int newS = fun.apply(s);
        System.out.println(newS);
    }
    private static void convertInt2String(int i, Function<Integer,String>fun){
        String str = fun.apply(i);
        System.out.println(str);
    }
    private static void convert(String s,Function<String,Integer>fun1,Function<Integer,String>fun2 ){
        Integer num= fun1.apply(s);
        String str = fun2.apply(num);
        System.out.println(str);

        //improve line 33-34:
        String str2 = fun1.andThen(fun2).apply(s);
    }

}

