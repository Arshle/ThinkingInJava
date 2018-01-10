/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: OzWitch.java
 * Author:   zhangdanji
 * Date:     2017年08月22日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
public enum OzWitch {
    WEST("Miss Gulch,aka the Wicked Witch of the West"),
    NORTH("Glinda,the good Witch of the North"),
    EAST("Wicked Witch of thr East,warer of the Ruby"),
    SOUTH("Good by interen");

    private String description;

    private OzWitch(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public static void main(String[] args) {
        for(OzWitch witch : OzWitch.values()){
            System.out.println(witch + ": " + witch.getDescription());
        }
    }
}
