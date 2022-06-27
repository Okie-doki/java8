package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo04 {

    public static void main(String[] args) {
        UnaryOperator<String> hi1 = (s) -> "hi "+s;
        System.out.println("hi1 = "+hi1.apply("dev-smith"));

        //스태틱 메소드
        UnaryOperator<String> hi2 = Greeting::hi;
        System.out.println("hi2 = "+hi2.apply("dev-smith"));

        //특정 객체 인스턴스 메소드 참조
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println("hello = "+hello.apply("dev-smith"));

        //생성자 참조
        Supplier<Greeting> newGreeting = Greeting::new;
        Greeting greetingCreate = newGreeting.get();

        Function<String, Greeting> smithGreeting = Greeting::new;
        Greeting smith = smithGreeting.apply("dev-smith");
        System.out.println("smith = "+smith.getName());

        //임의 객체의 인스턴스 메소드 참조
        String[] alphabet = {"keesun", "whiteship", "toby"};

        Arrays.sort(alphabet, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        Arrays.sort(alphabet, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(alphabet));


    }
}
