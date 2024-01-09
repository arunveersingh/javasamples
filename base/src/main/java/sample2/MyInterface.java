package sample2;

public interface MyInterface {
    default void methodOne() {
        commonMethod();
        // Additional code for methodOne
    }

    default void methodTwo() {
        commonMethod();
        // Additional code for methodTwo
    }

    private void commonMethod() {
        System.out.println("Common functionality");
    }
}


