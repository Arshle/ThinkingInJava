/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: CachedThreadPool.java
 * Author:   zhangdanji
 * Date:     2017年08月23日
 * Description:   
 */
package com.mychebao.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangdanji
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
