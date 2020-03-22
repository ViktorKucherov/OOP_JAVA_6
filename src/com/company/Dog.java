package com.company;

public class Dog extends Animal {

    public static int MAX_RUN = 500;
    public static double MAX_HEIGHT = 0.5;
    private static int MAX_SWIM = 10;

    //конструктор использует дефолтные макс.значения
    public Dog() {
        super("Новый песель", MAX_RUN, MAX_HEIGHT, MAX_SWIM);
    }

    //проверка песеля на бег
    @Override
    public boolean run(int distance) {
        return distance >= 0 && distance <= this.runDistance;
    }

    //проверка песеля на плавание
    @Override
    public boolean swim (int distance) {
        return distance >= 0 && distance <= this.swimDistance;
    }

    //проверка песеля на прыгучесть
    @Override
    public boolean jump (double height) {
        return height >= 0 && height <= this.jumpHeight;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setRunDistance(int distance) {
        if (distance >= 0 && distance <= MAX_RUN) {
            this.runDistance = distance;
        } else {
            System.out.println("Песель так не может!");
        }
    }

    @Override
    public void setSwimDistance(int distance) {
        if (distance >= 0 && distance <= MAX_SWIM) {
            this.runDistance = distance;
        } else {
            System.out.println("Песель так не может!");
        }
    }

    @Override
    public void setJumpHeight(double height) {
        if (height >= 0 && height <= MAX_HEIGHT) {
            this.jumpHeight = height;
        } else {
            System.out.println("Песель так не может!");
        }
    }

    ////геттеры
    public String getName() {
        return name;
    }
    public int getRunDistance() {
        return runDistance;
    }
    public int getSwimDistance() {
        return swimDistance;
    }
    public double getJumpHeight() {
        return jumpHeight;
    }
}