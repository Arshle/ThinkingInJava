/*
 * FileName: LightOff.java
 * Author:   Arshle
 * Date:     2019年01月28日
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
public class LightOff implements Runnable {

    protected int countDown = 10;

    private static int taskCount = 0;

    private final int id = taskCount ++;

    public LightOff(){}

    public LightOff(int countDown){
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "Lightoff!") + "), ";
    }

    @Override
    public void run() {
        while (countDown -- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        LightOff launch = new LightOff();
        launch.run();
    }
}
