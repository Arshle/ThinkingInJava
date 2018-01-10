/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: SerialNumberGenerator.java
 * Author:   zhangdanji
 * Date:     2017年08月24日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public static int nextSerialNumber(){
        return serialNumber ++;
    }
}
