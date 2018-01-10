/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: GetData.java
 * Author:   zhangdanji
 * Date:     2017年08月22日
 * Description:   
 */
package com.mychebao.java;

import java.nio.ByteBuffer;

/**
 * @author zhangdanji
 */
public class GetData {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        int i = 0;
        while(i++ < bb.limit()){
            if(bb.get() != 0){
                System.out.print("nonzero");
            }
        }
        System.out.print("i=" + i);
        bb.rewind();
        bb.asCharBuffer().put("Howdy!");
        char c;
        while((c = bb.getChar()) != 0){
            System.out.print(c + " ");
        }
        bb.rewind();
        bb.asShortBuffer().put((short) 471142);
        System.out.print(bb.getShort());
        bb.rewind();
        bb.asIntBuffer().put(99471142);
        System.out.print(bb.getInt());
        bb.rewind();

    }
}
