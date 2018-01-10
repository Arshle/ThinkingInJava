/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: ThreeTouple.java
 * Author:   zhangdanji
 * Date:     2017年08月21日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
public class ThreeTouple<A,B,C> extends TwoTuple<A,B> {
    public final C third;

    public ThreeTouple(A a,B b,C c){
        super(a,b);
        this.third = c;
    }

    public String toString(){
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
