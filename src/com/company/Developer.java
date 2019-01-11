package com.company;

public class Developer implements Runnable {

    private Spoon<Integer> data;
    Developer developer;

    public Developer(Spoon<Integer> data, Developer developer) {
        this.data = data;
        this.developer = developer;
    }

    public void think() {

        System.out.println("Is left spoon available?");

        System.out.println("Is right spoon available?");

        try{

        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void eat() {
        try {
            Thread.sleep((long) (Math.random() * 10));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while(true) {

            think();
            eat();

        }
    }

}
