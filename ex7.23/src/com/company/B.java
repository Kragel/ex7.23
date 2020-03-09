package com.company;

public class B extends A {
    static int k = printInit("B.k initialized");
    B()
    {
        System.out.println("B() constructor");
    }
}
