/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: UnrespinsiveUI.java
 * Author:   zhangdanji
 * Date:     2017年08月23日
 * Description:   
 */
package com.mychebao.java;

import java.io.IOException;

/**
 * @author zhangdanji
 */
class UnrespinsiveUI {
    private volatile double d = 1;

    public UnrespinsiveUI() throws Exception{
        while(d > 0){
            d = d + (Math.PI + Math.E) / d;
        }
        System.in.read();
    }
}

public class ResponsiveUI extends Thread{
    private static volatile double d = 1;

    public ResponsiveUI(){
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while(true){
            d = d + (Math.PI + Math.E) / d;
        }
    }

    public static void main(String[] args) throws IOException {
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}
