/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: FileLocking.java
 * Author:   zhangdanji
 * Date:     2017年08月22日
 * Description:   
 */
package com.mychebao.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangdanji
 */
public class FileLocking {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileOutputStream fos = new FileOutputStream("file.txt");
        FileLock fl = fos.getChannel().tryLock();
        if(fl != null){
            System.out.println("Locked File");
            TimeUnit.MILLISECONDS.sleep(100);
            fl.release();
            System.out.println("Released Lock");
        }
        fos.close();
    }
}
