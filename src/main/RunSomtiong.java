package main;

@FunctionalInterface
public interface RunSomtiong {

    int doIt(int number); //추상 메서드 1개만 있을 경우 함수형 인터페이스

    static void printName(){
        System.out.println("dev-smith");
    }

    default void pringAge(){
        System.out.println("40");
    }
}
