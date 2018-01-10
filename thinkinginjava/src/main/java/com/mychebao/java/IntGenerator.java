/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: IntGenerator.java
 * Author:   zhangdanji
 * Date:     2017年08月24日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel(){
        this.canceled = true;
    }

    public boolean isCanceled(){
        return this.canceled;
    }
}
