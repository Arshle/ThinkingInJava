/*
 * FileName: EnumMaps.java
 * Author:   Arshle
 * Date:     2019年01月25日
 * Description:
 */
package com.cicdi.enumdemo;

import java.util.EnumMap;
import java.util.Map;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */

interface Command{
    void action();
}

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em = new EnumMap<>(AlarmPoints.class);
        em.put(AlarmPoints.KITCHEN, () -> System.out.println("Kitchen fire!"));
        em.put(AlarmPoints.BATHROOM, () -> System.out.println("Bathroom alert!"));
        for(Map.Entry<AlarmPoints, Command> e : em.entrySet()){
            System.out.println(e.getKey() + ": ");
            e.getValue().action();
        }
    }
}
