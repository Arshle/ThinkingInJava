/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: IterableClass.java
 * Author:   zhangdanji
 * Date:     2017年08月19日
 * Description:   
 */
package com.mychebao.java;

import java.util.Iterator;

/**
 * @author zhangdanji
 */
public class IterableClass {
    private String[] words = "And that is how we know the Earth to be banana-shaped.".split(" ");

    public Iterator<String> iterator(){
        return new Iterator<String>() {
            private int index = 0;

            public boolean hasNext() {
                return index < words.length;
            }

            public String next() {
                return words[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
