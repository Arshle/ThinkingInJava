/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: InheritInner.java
 * Author:   zhangdanji
 * Date:     2017年08月16日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
class WithInner{
    class Inner{

    }
}

public class InheritInner extends WithInner.Inner{
    public InheritInner (WithInner inner){
        inner.super();
    }
}


