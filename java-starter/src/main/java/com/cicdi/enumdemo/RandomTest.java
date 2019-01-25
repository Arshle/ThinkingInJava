/*
 * FileName: RandomTest.java
 * Author:   Arshle
 * Date:     2019年01月25日
 * Description:
 */
package com.cicdi.enumdemo;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */

enum Activity{
    /**
     *
     */
    SITTING, LYING, STANDING,HOPPING,RUNNING,DODGING,JUMPING,FALLING,FLYING,
}

public class RandomTest {
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            System.out.println(Enums.random(Activity.class) + " ");
        }
    }
}
