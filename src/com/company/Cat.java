package com.company;

public class Cat extends Animal {

    public static int MAX_RUN = 200;
    public static double MAX_HEIGHT = 2;
    private static int MAX_SWIM = 0;

    //конструктор использует дефолтные макс.значения
    public Cat() {
        super("Новый кот",MAX_RUN, MAX_HEIGHT, MAX_SWIM);
    }

    //проверка кота на бег
    @Override
    public boolean run(int distance) {
        return distance >= 0 && distance <= this.runDistance;
    }

    @Override //кот не может плавать
    public boolean swim (int distance) {
        return false;
    }

    //проверка кота на прыгучесть
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
            System.out.println("Кот так не может!");
        }
    }

    @Override
    public void setSwimDistance(int distance) {
        System.out.println("Кот так не может!");;
    }

    @Override
    public void setJumpHeight(double height) {
        if (height >= 0 && height <= MAX_HEIGHT) {
            this.jumpHeight = height;
        } else {
            System.out.println("Кот так не может!");
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
