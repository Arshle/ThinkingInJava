/*
 * FileName: Chopstick.java
 * Author:   Arshle
 * Date:     2019年01月30日
 * Description:
 */
package com.cicdi.concurrent;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Chopstick {

    private boolean taken = false;

    public synchronized void take() throws InterruptedException{
        while(taken){
            wait();
        }
        taken = true;
    }

    public synchronized void drop(){
        taken = false;
        notifyAll();
    }
}
