/*
 * FileName: UpcastEnum.java
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

enum Search{
    /**
     *
     */
    HITHER, YON
}

public class UpcastEnum {

    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HITHER;
        for (Enum en : e.getClass().getEnumConstants()) {
            System.out.println(en);
        }
    }
}
