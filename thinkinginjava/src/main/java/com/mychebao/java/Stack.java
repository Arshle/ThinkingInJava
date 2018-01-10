/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Stack.java
 * Author:   zhangdanji
 * Date:     2017年08月17日
 * Description: 栈  
 */
package com.mychebao.java;

import java.util.LinkedList;

/**
 * 栈
 *
 * @author zhangdanji
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T clazz){
        storage.addFirst(clazz);
    }

    public T peek(){
        return storage.getFirst();
    }

    public T pop(){
        return storage.removeFirst();
    }

    public boolean isEmpty(){
        return storage.isEmpty();
    }

    @Override
    public String toString(){
        return storage.toString();
    }
}
