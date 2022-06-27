package main;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class Foo03 {
    public static void main(String[] args) {
        Supplier<Integer> get11 = () -> 11;
        BinaryOperator<Integer> sum = (Integer a, Integer b) -> a + b;

        Foo03 foo3 = new Foo03();
        foo3.run();
    }

    private void run(){

        final int baseNumber = 10;

        //로컬 클래스
        class LocalClass{
            void printBaseNumber(){
                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printBaseNumber();

        //익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber);
            }
        };

        integerConsumer.accept(10);

        //람다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);
    }
}
