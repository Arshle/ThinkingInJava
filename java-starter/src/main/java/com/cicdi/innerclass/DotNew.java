/*
 * FileName: DotNew.java
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
public class DotNew {

    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        Inner inner = dn.new Inner();
    }
}
