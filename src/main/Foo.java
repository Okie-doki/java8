package main;

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
    }
}
