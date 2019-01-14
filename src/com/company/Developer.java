package com.company;

public class Developer extends Thread {

    private Spoon spoonLeft;
    private Spoon spoonRight;
    private String name;

    public Developer(Spoon spoonLeft, Spoon spoonRight, String name) {
        this.spoonLeft = spoonLeft;
        this.spoonRight = spoonRight;
        this.name = name;
    }

    public void run() {

//        System.out.println("Is left spoon available?");
//
//        System.out.println("Is right spoon available?");

        try{
            System.out.println(name + " is thinking...");
            Thread.sleep((long) (Math.random() * 2500));
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        while(true) {
            eat();
        }

    }

    public void eat() {

        if (spoonLeft.pickUp()) {
            if (spoonRight.pickUp()) {
                try {
                    System.out.println(name + "is eating.");
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                spoonLeft.putDown();
                spoonRight.putDown();

            } else {
                spoonLeft.putDown();
            }
        }
    }
}
