/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: TwoTuple.java
 * Author:   zhangdanji
 * Date:     2017年08月21日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
public class TwoTuple<A,B> {

    public final A first;

    public final B second;

    public TwoTuple(A a,B b){
        this.first = a;
        this.second = b;
    }

    public String toString(){
        return "(" + first + ", " + second + ")";
    }
}
