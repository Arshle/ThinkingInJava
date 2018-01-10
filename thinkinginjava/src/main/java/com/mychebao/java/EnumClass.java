/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: EnumClass.java
 * Author:   zhangdanji
 * Date:     2017年08月22日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
enum Shrubbery{
    GROUND,CRAWLING,HANGING
}

public class EnumClass {
    public static void main(String[] args) {
        for(Shrubbery s : Shrubbery.values()){
            System.out.println(s + " ordinal: " + s.ordinal());
            System.out.println(s.compareTo(Shrubbery.CRAWLING) + " ");
            System.out.println(s.equals(Shrubbery.CRAWLING + " "));
            System.out.println(s == Shrubbery.CRAWLING);
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
        }

        System.out.println("====================");
        for(String s : "HANGING CRAWING GROUND".split(" ")){
            Shrubbery shrub = Enum.valueOf(Shrubbery.class,s);
            System.out.println(shrub);
        }
    }
}
