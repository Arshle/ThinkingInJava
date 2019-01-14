/*
 * FileName: GreenhouseControls.java
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
public class GreenhouseControls extends Controller {

    private boolean light = false;

    public class LightOn extends Event{

        public LightOn(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event{

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

}
