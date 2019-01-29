/*
 * FileName: ThreadLocalVariableHolder.java
 * Author:   Arshle
 * Date:     2019年01月29日
 * Description:
 */
package com.cicdi.concurrent;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */

class Accessor implements Runnable{

    private final int id;

    public Accessor(int id){
        this.id = id;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            ThreadLocalVariableHolder.increment();
            System.out.println(this);
            Thread.yield();
        }
    }

    @Override
    public String toString() {
        return "#" + id + ": " + ThreadLocalVariableHolder.get();
    }
}

public class ThreadLocalVariableHolder {

    private static ThreadLocal<Integer> value = new ThreadLocal<Integer>(){

        private Random rand = new Random(47);

        @Override
        protected synchronized Integer initialValue(){
            return rand.nextInt(10000);
        }
    };

    public static void increment(){
        value.set(value.get() + 1);
    }

    public static int get(){
        return value.get();
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i ++){
            exec.execute(new Accessor(i));
        }
        TimeUnit.SECONDS.sleep(3);
        exec.shutdownNow();
    }
}
