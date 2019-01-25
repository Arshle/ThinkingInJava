/*
 * FileName: Enums.java
 * Author:   Arshle
 * Date:     2019年01月25日
 * Description:
 */
package com.cicdi.enumdemo;

import java.util.Random;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Enums {

    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> ec){
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values){
        return values[rand.nextInt(values.length)];
    }
}
