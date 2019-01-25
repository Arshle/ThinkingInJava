/*
 * FileName: Food.java
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
public interface Food {

    enum Appetizer implements Food{
        /**
         *
         */
        SALAD, SOUP, SPRING_ROLLS;
    }

    enum MainCourse implements Food{
        /**
         *
         */
        LASAGNE, BURRITO, PAD_THAI,
        LENTILS, HUMMOUS, VINDALOO;
    }

    enum Dessert implements Food{
        /**
         *
         */
        TIRAMISU, GELATO, BLACK_FOREST_CAKE,
        FRUIT, CREME_CARAMEL;
    }

    enum Coffee implements Food{
        /**
         *
         */
        BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
        LATTE, CAPPUCCINO, TEA, HERB_TEA;
    }
}
