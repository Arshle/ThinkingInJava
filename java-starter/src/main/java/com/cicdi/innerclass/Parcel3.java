/*
 * FileName: Parcel3.java
 * Author:   Arshle
 * Date:     2019年01月10日
 * Description:
 */
package com.cicdi.innerclass;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Parcel3 {

    class Contents{
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination{
        private String label;

        Destination(String whereTo){
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("Tasmania");
    }
}
