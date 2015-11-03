package com.company;

/**
 * Created by msimpson on 8/27/15.
 */
public class Tea extends HotBev{

    protected void brew() {
        System.out.println("Steeping Tea");
    }

    protected void additions() {
        System.out.println("Lemon");
    }

}
