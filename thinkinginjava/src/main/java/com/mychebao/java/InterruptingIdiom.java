/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: InterruptingIdiom.java
 * Author:   zhangdanji
 * Date:     2017年08月24日
 * Description:   
 */
package com.mychebao.java;

import java.util.concurrent.TimeUnit;

/**
 * @author zhangdanji
 */
class NeedsCleanup{
    private final int id;

    public NeedsCleanup(int ident){
        this.id = ident;
        System.out.println("NeedsCleanup " + id);
    }

    public void cleanup(){
        System.out.println("Clean up " + id);
    }
}

class Blocked3 implements Runnable{

    private volatile double d = 0.0;

    public void run() {
        try {
            while (!Thread.interrupted()){
                NeedsCleanup n1 = new NeedsCleanup(1);
                try {
                    System.out.println("Sleeping");
                    TimeUnit.SECONDS.sleep(1);
                    NeedsCleanup n2 = new NeedsCleanup(2);
                    try {
                        System.out.println("Calculating");
                        for(int i = 1; i < 2500000; i ++){
                            d = d + (Math.PI + Math.E) / d;
                        }
                        System.out.println("Finished time-consuming operation");
                    } finally {
                        n2.cleanup();
                    }
                } finally {
                    n1.cleanup();
                }
            }
            System.out.println("Exiting via while() test");
        } catch (InterruptedException e) {
            System.out.println("Exiting via InterruptedExcetion");
        }
    }
}

public class InterruptingIdiom {
    public static void main(String[] args) throws InterruptedException {
        if(args.length != 1){
            System.out.println("usage");
            System.exit(1);
        }
        Thread t = new Thread(new Blocked3());
        t.start();
        TimeUnit.SECONDS.sleep(new Integer(args[0]));
        t.interrupt();
    }
}
