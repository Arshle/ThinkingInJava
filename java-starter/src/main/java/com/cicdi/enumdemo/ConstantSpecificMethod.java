/*
 * FileName: ConstantSpecificMethod.java
 * Author:   Arshle
 * Date:     2019年01月25日
 * Description:
 */
package com.cicdi.enumdemo;

import java.text.DateFormat;
import java.util.Date;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public enum ConstantSpecificMethod {

    /**
     *
     */
    DATE_TIME{
        @Override
        String getInfo(){
            return DateFormat.getDateInstance().format(new Date());
        }
    },

    CLASSPATH{
        @Override
        String getInfo(){
            return System.getenv("CLASSPATH");
        }
    },

    VERSION{
        @Override
        String getInfo(){
            return System.getenv("java.version");
        }
    };

    abstract String getInfo();

    public static void main(String[] args) {
        for(ConstantSpecificMethod csm : values()){
            System.out.println(csm.getInfo());
        }
    }
}
