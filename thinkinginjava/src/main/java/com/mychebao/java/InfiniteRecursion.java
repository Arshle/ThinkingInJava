/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: InfiniteRecursion.java
 * Author:   zhangdanji
 * Date:     2017年08月19日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
public class InfiniteRecursion {

    static{
        System.out.println("init");
    }
    @Override
    public String toString(){
        return "address" + super.toString() + "\n";
    }
}
