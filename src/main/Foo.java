package main;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {

        //익명 내부 클래스 → 람다
//        RunSomtiong runSomtiong = () -> System.out.println("HELLO");

//        RunSomtiong runSomtiong = () -> {
//            System.out.println("HELLO");
//            System.out.println("WORD");
//        };

        RunSomtiong runSomtiong = (number) -> {
            return number + 10;
        };

        System.out.println(runSomtiong.doIt(1));

        Plus10 plus10 = new Plus10();
        System.out.println("plus10 = "+plus10.apply(1));

        Function<Integer, Integer> plus11 = (i) -> i+11;
        System.out.println("plus11 = "+plus11.apply(1));

        Function<Integer, Integer> multiply2 = (i) -> i*2;
        System.out.println("multiply2 = "+multiply2.apply(2));

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println("multiply2AndPlus10 = "+multiply2AndPlus10.apply(2));

        System.out.println("plus10.andThen(multiply2) = "+plus10.andThen(multiply2).apply(2));

        BiFunction<Integer, Integer, Integer> plusFunc = (i, j) -> i+j;
        System.out.println("plusFunc = "+plusFunc.apply(2, 3));

        Consumer<Integer> printT = (i) -> System.out.println("pritnT = "+i);
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;
        System.out.println("get10 = "+get10.get());

        Predicate<String> startsWithDev = (s) -> s.startsWith("dev");
        System.out.println("startsWithTest = "+startsWithDev.test("dev"));

        Predicate<Integer> isEven = (i) -> i % 2 == 0;
        System.out.println("isEven = "+isEven.test(2));

        UnaryOperator<Integer> plus10Unary = (i) -> i+10;
        System.out.println("plus10Unary = "+plus10Unary.apply(1));

        UnaryOperator<Integer> multiply2Unary = (i) -> i*2;
        System.out.println("multiply2Unary = "+multiply2Unary.apply(2));

        BinaryOperator<Integer> plusBinaryOperatorSample = (i, j) -> i+j;
        System.out.println("plusBinaryOperatorSample = "+plusBinaryOperatorSample.apply(10,5));

    }
}
