/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: LargeMappedFiles.java
 * Author:   zhangdanji
 * Date:     2017年08月22日
 * Description:   
 */
package com.mychebao.java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author zhangdanji
 */
public class LargeMappedFiles {
    static int length = 0x8FFFFFF;

    public static void main(String[] args) throws IOException {
        MappedByteBuffer out = new RandomAccessFile("test.data", "rw").getChannel().map(FileChannel.MapMode.READ_ONLY, 0, length);
        for(int i = 0; i < length; i ++){
            out.put((byte)'x');
        }
        System.out.print("Finished writing");
        for(int i = length/2; i < length/2 + 6; i++){
            System.out.print((char)out.get(i));
        }
    }
}
