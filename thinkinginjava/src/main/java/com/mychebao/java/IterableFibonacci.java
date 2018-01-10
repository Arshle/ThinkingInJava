/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: IterableFibonacci.java
 * Author:   zhangdanji
 * Date:     2017年08月21日
 * Description:   
 */
package com.mychebao.java;

import java.util.Iterator;

/**
 * @author zhangdanji
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

    public Iterator<Integer> iterator() {
        return null;
    }
}

class GenericMethods{
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }
}