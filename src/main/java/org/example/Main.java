package org.example;

import org.example.enums.TypesTrafficLightBase;
import org.example.lights.TrafficLight;
import org.example.lights.TrafficLightFactory;

public class Main {
    public static void main(String[] args) {
        TrafficLightFactory factory = new TrafficLightFactory();

        for (TypesTrafficLightBase tb: TypesTrafficLightBase.values()) {
            TrafficLight tl = factory.createTrafficLight(tb);
            tl.startTrafficLight();
        }
    }
}