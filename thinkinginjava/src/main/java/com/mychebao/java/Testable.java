/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Testable.java
 * Author:   zhangdanji
 * Date:     2017年08月23日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
public class Testable {
    public void execute(){
        System.out.println("Executing..");
    }

    @Test void testExecute(){
        execute();
    }
}
