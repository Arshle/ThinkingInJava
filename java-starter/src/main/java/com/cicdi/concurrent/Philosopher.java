/*
 * FileName: Philosopher.java
 * Author:   Arshle
 * Date:     2019年01月30日
 * Description:
 */
package com.cicdi.concurrent;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Philosopher implements Runnable {

    private Chopstick left;

    private Chopstick right;

    private final int id;

    private final int ponderFactor;

    private Random rand = new Random(47);

    public Philosopher(Chopstick left, Chopstick right, int ident, int ponder){
        this.left = left;
        this.right = right;
        id = ident;
        ponderFactor = ponder;
    }

    private void pause() throws InterruptedException{
        if(ponderFactor == 0){
            return;
        }
        TimeUnit.MILLISECONDS.sleep(rand.nextInt(ponderFactor * 250));
    }

    @Override
    public void run() {
        while(!Thread.interrupted()){
            try {
                System.out.println(this + " " + "thinking");
                pause();
                System.out.println(this + " " + " grabbing right");
                right.take();
                System.out.println(this + " " + " eating");
                pause();
                right.drop();
                left.drop();
            } catch (InterruptedException e) {
                System.out.println(this + " " + "exiting via interrupt");
            }
        }
    }

    @Override
    public String toString() {
        return "Philosopher " + id;
    }
}
