package com.company;

/**
 * Created by msimpson on 8/27/15.
 */
public abstract class HotBev {
    public final void make() {
        boilWater();
        brew();
        pour();
        additions();
        hook();
    }

    abstract void brew();
    abstract void additions();

    private void boilWater() {
        System.out.println("Boiling");
    }

    private void pour() {
        System.out.println("Pouring");
    }

    protected void hook() { }
}
