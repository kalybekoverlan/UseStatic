package com.erik;

public class UseStatic {
    static int a=5;
    static int b=2;

    static void add(){
        System.out.println(a+"+"+b+"="+(a*b));
    }

    static {
        System.out.println("Static block!");
    }

    public static void main(String[] args) {
        add();
        AnotherStatic.callme();

    }
}
