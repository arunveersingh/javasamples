package com.oopsfeedmecode.sample2;

public interface MyInterface {
    void method();

    default void methodOne() {
        commonMethod();
    }

    default void methodTwo() {
        commonMethod();
    }

    static void staticMethod(){
        System.out.println
                ("Static method.");
    }

    private void commonMethod() {
        System.out.println
                ("Common code.");
    // suggest what to do
        System.out.println("Test");

    }

}


