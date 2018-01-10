/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: PriorityBlockingQueueDemo.java
 * Author:   zhangdanji
 * Date:     2017年08月25日
 * Description:   
 */
package com.mychebao.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangdanji
 */
class PrioritizedTask implements Runnable,Comparable<PrioritizedTask>{

    private Random rand = new Random(47);
    private static int counter = 0;
    private final int id = counter ++;
    private final int priority;
    protected static List<PrioritizedTask> sequence = new ArrayList<PrioritizedTask>();

    public PrioritizedTask(int priority){
        this.priority = priority;
        sequence.add(this);
    }

    public int compareTo(PrioritizedTask arg){
        return priority < arg.priority ? 1 : (priority > arg.priority ? -1 : 0);
    }

    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(rand.nextInt(250));
        } catch (InterruptedException e) {

        }
        System.out.println(this);
    }

    public String toString(){
        return String.format("[%1$-3d]",priority) + " Task " + id;
    }

    public String summary(){
        return "(" + id + ":" + priority + ")";
    }

    public static class EndSentinel extends PrioritizedTask{

        private ExecutorService exec;

        public EndSentinel(ExecutorService e){
            super(-1);
            this.exec = e;
        }

        @Override
        public void run() {
            int count = 0;
            for(PrioritizedTask pt : sequence){
                System.out.println(pt.summary());
                if(++count % 5 == 0){
                    System.out.println("");
                }
            }
            System.out.println("");
            System.out.println(this + " Calling shutdownNow()");
            exec.shutdownNow();
        }
    }
}

class PrioritizedTaskProducer implements Runnable{

    private Random rand = new Random(47);
    private Queue<Runnable> queue;
    private ExecutorService exec;

    public PrioritizedTaskProducer(Queue<Runnable> q,ExecutorService e){
        queue = q;
        exec = e;
    }

    public void run() {
        for(int i = 0; i < 20; i ++){
            queue.add(new PrioritizedTask(rand.nextInt(10)));
            Thread.yield();
        }

        try {
            TimeUnit.MILLISECONDS.sleep(250);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class PriorityBlockingQueueDemo {
}
