package org.example.model;

import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {


    public static void main(String[] args) {
        Lamp lamp=new Lamp(LampType.NORMAL,true,3);
        lamp.turnOn();

        Ceiling ceiling=new Ceiling(3,PaintColor.GREEN);
        ceiling.create();

        Bed bed=new Bed("2 kişilik",2,1,1,1);
        System.out.println(bed.toString());

        Wall northWall=new Wall("North");
        Wall eastWall=new Wall("East");
        Wall westWall=new Wall("West");
        Wall southWall=new Wall("South");

        Wall[] walls={northWall,eastWall,westWall,southWall};
        Bedroom bedroom=new Bedroom(northWall,eastWall,westWall,southWall,
                ceiling,lamp,
                new Carpet(2,2,PaintColor.WHITE),"bedroom",
                bed,new Wardrobe(2,2,1));
        System.out.println(bedroom);




    }
}