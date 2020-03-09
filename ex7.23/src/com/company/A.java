package com.company;

public class A {
    static int j = printInit("A.j initialized");
    static int printInit(String s)
    {
        System.out.println(s);
        return 1;
    }
    A()
    {
        System.out.println("A() constructor");
    }
}
