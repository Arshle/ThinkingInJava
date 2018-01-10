/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Holder1.java
 * Author:   zhangdanji
 * Date:     2017年08月21日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
class Automobile{}

public class Holder<T> {
    private T t;

    public Holder(T t){
        this.t = t;
    }

    T get(){
        return t;
    }

    public static void main(String[] args) {
        Holder<Automobile> h = new Holder<Automobile>(new Automobile());
        Automobile a = h.get();
    }
}
