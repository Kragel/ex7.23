package com.company;

public class C {
    static int n = printInitC("C.n initialized");
    static A a = new A();
    C()
    {
        System.out.println("C() constructor");
    }
    static int printInitC(String s)
    {
        System.out.println(s);
        return 1;
    }
}
