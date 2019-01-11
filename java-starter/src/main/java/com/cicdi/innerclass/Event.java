/*
 * FileName: Event.java
 * Author:   Arshle
 * Date:     2019年01月11日
 * Description:
 */
package com.cicdi.innerclass;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public abstract class Event {

    private long eventTime;

    protected final long delayTime;

    public Event(long delayTime){
        this.delayTime = delayTime;
        start();
    }

    public void start(){
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
