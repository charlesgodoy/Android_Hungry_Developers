package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Spoon <T>{
    private List<T> leftSpoon;
    private List<T> rightSpoon;
    private Semaphore lock;


    public boolean acquire() {
        try {
            lock.acquire();
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }


    public void pickup(T leftSpoon) {
        while(!this.acquire()) {}
        leftSpoon.ad
        this.putDown();
    }

    public void putDown() {
        lock.release();
    }

}
