/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Content.java
 * Author:   zhangdanji
 * Date:     2017年08月16日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
public interface Content {

    public void doSomething();

    class ContentImpl implements Content{
        public void doSomething() {
            System.out.println("doSomeThing");
        }

        public static void main(String[] args) {
            new ContentImpl().doSomething();
        }
    }

}
