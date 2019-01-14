package com.company;

import java.util.concurrent.Semaphore;

public class Spoon {
    private
    Semaphore spoon = new Semaphore(1);
    public int id;

    Spoon (int id) {
        this.id = id;
    }

    public int id() {
        return id;
    }


    public boolean pickUp() {
        return spoon.tryAcquire();
    }

    public void putDown() {
        spoon.release();
    }

}
