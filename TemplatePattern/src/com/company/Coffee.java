package com.company;

/**
 * Created by msimpson on 8/27/15.
 */
public class Coffee extends HotBev{

    protected void brew() {
        System.out.println("Brewing Coffee");
    }

    protected void additions() {
        System.out.println("Milk & Sugar");
    }

    protected void hook(){
        System.out.println("Optional customizing");
    }

}
