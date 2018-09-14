package com.svlugovoy.patterns.structural.proxy;

public class RealService implements ServiceInterface{

    public String doOperation() {
        System.out.println("*** Real operation executed. ***");
        return "Hello";
    }
}
