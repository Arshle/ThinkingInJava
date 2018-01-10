/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: DaemonFromFactory.java
 * Author:   zhangdanji
 * Date:     2017年08月23日
 * Description:   
 */
package com.mychebao.java;

import java.util.concurrent.ThreadFactory;

/**
 * @author zhangdanji
 */
public class DaemonThreadFactory implements ThreadFactory {

    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
