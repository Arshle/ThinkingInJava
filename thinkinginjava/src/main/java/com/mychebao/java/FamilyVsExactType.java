/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: FamilyVsExactType.java
 * Author:   zhangdanji
 * Date:     2017年08月20日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */

class Base{}

class Derived extends Base{}

public class FamilyVsExactType {
    static void test(Object x){
        System.out.println("Testing x of type " + x.getClass());
        System.out.println("x instanceof Base " + (x instanceof Base));
    }
}
