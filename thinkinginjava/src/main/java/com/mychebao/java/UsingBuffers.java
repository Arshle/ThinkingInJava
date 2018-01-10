/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: UsingBuffers.java
 * Author:   zhangdanji
 * Date:     2017年08月22日
 * Description:   
 */
package com.mychebao.java;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * @author zhangdanji
 */
public class UsingBuffers {
    private static void symmetricScramble(CharBuffer buffer){
        while(buffer.hasRemaining()){
            buffer.mark();
            char c1 = buffer.get();
            char c2 = buffer.get();
            buffer.reset();
            buffer.put(c2).put(c1);
        }
    }

    public static void main(String[] args) {
        char[] data = "Usingbuffers".toCharArray();
        ByteBuffer bb = ByteBuffer.allocate(data.length * 2);
        CharBuffer cb = bb.asCharBuffer();
        cb.put(data);
        System.out.print(cb.rewind());
        symmetricScramble(cb);
        System.out.print(cb.rewind());
        symmetricScramble(cb);
        System.out.print(cb.rewind());
    }
}
