/*
 * FileName: DeadlockingDiningPhilosophers.java
 * Author:   Arshle
 * Date:     2019年01月31日
 * Description:
 */
package com.cicdi.concurrent;

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
public class DeadlockingDiningPhilosophers {
    public static void main(String[] args) throws Exception {
        int ponder = 5;
        if(args.length > 0){
            ponder = Integer.parseInt(args[0]);
        }
        int size = 5;
        if(args.length > 1){
            size = Integer.parseInt(args[1]);
        }
        ExecutorService exec = Executors.newCachedThreadPool();
        Chopstick[] sticks = new Chopstick[size];
        for(int i = 0; i < size; i ++){
            sticks[i] = new Chopstick();
        }
        for(int i = 0; i < size; i ++){
            exec.execute(new Philosopher(sticks[i], sticks[(i + 1) % size], i , ponder));
        }
        if(args.length == 3 && args[2].equals("timeout")){
            TimeUnit.SECONDS.sleep(5);
        }else{
            System.out.println("Press 'Enter' tp quit");
            System.in.read();
        }
        exec.shutdown();
    }
}
