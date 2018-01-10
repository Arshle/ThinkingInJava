/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Fat.java
 * Author:   zhangdanji
 * Date:     2017年08月25日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
public class Fat {
    private volatile double d;
    private static int counter = 0;
    private final int id = counter++;

    public Fat(){
        for(int i = 1; i < 10000; i ++){
            d += (Math.PI + Math.E) / (double)i;
        }
    }

    public void operation(){
        System.out.println(this);
    }

    public String toString(){
        return "Fat id: " + id;
    }
}
