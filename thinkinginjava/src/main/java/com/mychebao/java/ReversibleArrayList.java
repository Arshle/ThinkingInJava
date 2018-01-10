/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: ReversibleArrayList.java
 * Author:   zhangdanji
 * Date:     2017年08月19日
 * Description:   
 */
package com.mychebao.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author zhangdanji
 */
public class ReversibleArrayList<T> extends ArrayList<T> {

    public ReversibleArrayList(Collection<T> c){
        super(c);
    }

    public Iterator<T> iterator(){

        return new Iterator<T>() {

            private int index = 0;

            public boolean hasNext() {
                return index < size();
            }

            public T next() {
                return get(index++);
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
