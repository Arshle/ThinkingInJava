/*
 * FileName: TerminationCondition.java
 * Author:   Arshle
 * Date:     2019年01月09日
 * Description: 对象终结条件
 */
package com.cicdi.finalize;

/**
 * 〈对象终结条件〉<br>
 * 〈对象终结条件〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
class Book{
    boolean checkedOut = false;

    Book(boolean checkOut){
        checkedOut = checkOut;
    }

    void checkIn(){
        checkedOut = false;
    }

    @Override
    protected void finalize(){
        if(checkedOut){
            System.out.println("Error: checked out");
        }
    }
}

public class TerminationCondition {

    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
