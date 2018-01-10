/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Fibonacci.java
 * Author:   zhangdanji
 * Date:     2017年08月21日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
public class Fibonacci implements Generator<Integer> {

    private int count = 0;

    public Integer next() {
        return fib(count++);
    }

    private int fib(int n){
        if(n < 2){
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }


}
