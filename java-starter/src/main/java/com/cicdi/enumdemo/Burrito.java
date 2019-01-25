/*
 * FileName: Burrito.java
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

enum Spiciness{
    /**
     *
     */
    NOT, MILD, MEDIUM, HOT, FLAMING
}

public class Burrito {

    Spiciness degree;

    public Burrito(Spiciness degree){
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Burrito is " + degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(Spiciness.NOT));
        System.out.println(new Burrito(Spiciness.MEDIUM));
        System.out.println(new Burrito(Spiciness.HOT));
    }
}
