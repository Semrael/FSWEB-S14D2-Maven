package org.example;

import org.example.model.Lamp;
import org.example.model.LampType;

public class Main {


    public static void main(String[] args) {
        Lamp lamp=new Lamp(LampType.LAVA,true,2);
        System.out.println(lamp);
        lamp.getStyle(LampType.NEON);
        System.out.println(lamp);
    }
}