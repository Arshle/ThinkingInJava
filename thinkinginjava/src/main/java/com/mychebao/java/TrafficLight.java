/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: TrafficLight.java
 * Author:   zhangdanji
 * Date:     2017年08月22日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
enum Signal{
    GREEN,YELLOW,RED
}

public class TrafficLight {
    Signal color = Signal.RED;

    public void change(){
        switch (color){
            case RED:
        }
    }
}
