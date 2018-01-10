/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Outer.java
 * Author:   zhangdanji
 * Date:     2017年08月16日
 * Description: Outer  
 */
package com.mychebao.java;

/**
 * Outer
 *
 * @author zhangdanji
 */
public class Outer {

    private String msg = "11111";

    private class ContentImpl implements Content{

        public void doSomething() {
            System.out.println("do Something");
        }
    }

    public Content getContent(){
        return new ContentImpl();
    }
}
