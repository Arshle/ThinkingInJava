/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Part.java
 * Author:   zhangdanji
 * Date:     2017年08月20日
 * Description:   
 */
package com.mychebao.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * @author zhangdanji
 */
class Part {

    @Override
    public String toString(){
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();

    static{
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratoryBelt.Factory());
    }

    private static Random random = new Random(47);

    public static Part createRandom(){
        int n = random.nextInt(partFactories.size());
        return partFactories.get(n).creat();
    }
}

class Filter extends Part{}

class FuelFilter extends Filter{

    public static class Factory implements com.mychebao.java.Factory<FuelFilter>{

        public FuelFilter creat() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter{

    public static class Factory implements com.mychebao.java.Factory<AirFilter>{

        public AirFilter creat() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter{
    public static class Factory implements com.mychebao.java.Factory<CabinAirFilter>{

        public CabinAirFilter creat() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter{
    public static class Factory implements com.mychebao.java.Factory<OilFilter>{

        public OilFilter creat() {
            return new OilFilter();
        }
    }
}

class Belt extends Filter{}

class FanBelt extends Belt{
    public static class Factory implements com.mychebao.java.Factory<FanBelt>{

        public FanBelt creat() {
            return new FanBelt();
        }
    }
}

class GeneratoryBelt extends Belt{
    public static class Factory implements com.mychebao.java.Factory<GeneratoryBelt>{

        public GeneratoryBelt creat() {
            return new GeneratoryBelt();
        }
    }
}

class PowerSteeringBelt extends Belt{
    public static class Factory implements com.mychebao.java.Factory<PowerSteeringBelt>{

        public PowerSteeringBelt creat() {
            return new PowerSteeringBelt();
        }
    }
}

public class RegisteredFactories{
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(Part.createRandom());
        }
    }
}
