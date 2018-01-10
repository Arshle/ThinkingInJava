/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: EvenGenerator.java
 * Author:   zhangdanji
 * Date:     2017年08月24日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    public int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
