/*
 * FileName: Controller.java
 * Author:   Arshle
 * Date:     2019年01月11日
 * Description:
 */
package com.cicdi.innerclass;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Controller {

    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event c){
        eventList.add(c);
    }

    public void run() {
        while(eventList.size() > 0){
            for(Event e : new ArrayList<>(eventList)){
                if(e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
