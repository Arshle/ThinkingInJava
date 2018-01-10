/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Reflection.java
 * Author:   zhangdanji
 * Date:     2017年08月23日
 * Description:   
 */
package com.mychebao.java;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author zhangdanji
 */
public class Reflection {
    public static Set<String> analyze(Class<?> enumClass){
        System.out.println("---Analyzing " + enumClass + "---");
        System.out.println("Interfaces:");
        for(Type type : enumClass.getGenericInterfaces()){
            System.out.println(type);
        }
        System.out.println("Base: " + enumClass.getSuperclass());
        System.out.println("Methods: ");
        Set<String> methods = new TreeSet<String>();
        for(Method m : enumClass.getMethods()){
            methods.add(m.getName());
        }
        return methods;
    }

    public static void main(String[] args) {
    }
}
