package com.company;

public abstract class Animal {
    //поля
    protected String name;
    protected int runDistance;
    protected double jumpHeight;
    protected int swimDistance;


    //конструктор
    public Animal(String name, int runDistance, double jumpHeight, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;

    }

    //поведение
    public abstract boolean run(int distance);
    public abstract boolean swim(int distance);
    public abstract boolean jump(double height);

    //сеттеры
    public abstract void setName(String name);
    public abstract void setRunDistance(int distance);
    public abstract void setSwimDistance(int distance);
    public abstract void setJumpHeight(double height);

    //геттеры
    public abstract String getName();
    public abstract int getRunDistance();
    public abstract int getSwimDistance();
    public abstract double getJumpHeight();

}
