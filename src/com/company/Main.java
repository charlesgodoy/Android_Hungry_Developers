package com.company;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Dev 1", "Dev 2", "Dev 3", "Dev 4", "Dev 5"};
        Spoon[] spoon = new Spoon[5];
        Developer[] developer = new Developer[5];


        for (int i = 0; i < spoon.length; i++) {
            spoon[i] = new Spoon(i);
        }

        for (int i = 0; i < developer.length; i++) {

            if (i != developer.length - 1) {
                developer[i] = new Developer(spoon[i], spoon[i + 1], names[i]);
                developer[i].start();
            } else {
                developer[i] = new Developer(spoon[0], spoon[i], names[i]);
                developer[i].start();
            }
        }

    }
}