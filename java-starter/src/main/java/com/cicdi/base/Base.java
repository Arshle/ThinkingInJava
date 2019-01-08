/*
 * FileName: Base.java
 * Author:   Arshle
 * Date:     2019年01月08日
 * Description: 基础操作符
 */
package com.cicdi.base;

/**
 * 〈基础操作符〉<br>
 * 〈基础操作符〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Base {

    public static void main(String[] args) {
        //需要加后缀f表示单精度，否则为双精度报错
        float f = 1e-43f;
        System.out.println(f);
        //二进制操作符
        int a = 31;
        int b = 41;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a & b));
        //标签中断循环
        int i = 0;
        outer:
        for(;true;){
            inner:
            for(; i < 10; i++){
                System.out.println("i = " + i);
                if(i == 2){
                    System.out.println("continue");
                    continue;
                }
                if(i == 3){
                    System.out.println("break");
                    i++;
                    break;
                }
                if(i == 7){
                    System.out.println("continue outer");
                    i ++;
                    continue outer;
                }
                if(i == 8){
                    System.out.println("break outer");
                    break outer;
                }
                for(int k = 0; k < 5; k ++){
                    if(k == 3){
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}
