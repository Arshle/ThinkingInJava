/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: EnumImplementation.java
 * Author:   zhangdanji
 * Date:     2017年08月23日
 * Description:   
 */
package com.mychebao.java;

import java.util.Random;

/**
 * @author zhangdanji
 */
enum CartoonCharacter implements Generator<CartoonCharacter>{
    SLAPPY,SPANKY,PUNCHY,SILLY,BOUNCY,NUTTY,BOB;

    private Random rand = new Random();

    public CartoonCharacter next(){
        return values()[rand.nextInt(values().length)];
    }
}

public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg){
        System.out.println(rg.next() + ",");
    }

    public static void main(String[] args) {
        CartoonCharacter cc = CartoonCharacter.BOB;
        for(int i = 0; i < 10; i ++){
            printNext(cc);
        }
    }
}
