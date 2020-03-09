package com.company;

public class LoadClass extends B {
    static int i = printInit("LoadClass.i initialized");
    LoadClass()
    {
        System.out.println("LoadClass() constructor");
    }
}
