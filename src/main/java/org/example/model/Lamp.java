package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType lampType, boolean battery, int globRating) {
        this.style = lampType;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating(){
        return globRating;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "lampType=" + style +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}
