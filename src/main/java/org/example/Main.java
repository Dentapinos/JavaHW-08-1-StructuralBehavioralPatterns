package org.example;

import org.example.enums.TypesTrafficLightBase;
import org.example.lights.TrafficLight;
import org.example.lights.TrafficLightFactory;

public class Main {
    public static void main(String[] args) {
        TrafficLightFactory factory = new TrafficLightFactory();

        TrafficLight tr1 = factory.createTrafficLight(TypesTrafficLightBase.T1_VERTICAL);
        TrafficLight tr2 = factory.createTrafficLight(TypesTrafficLightBase.T1_HORIZONTAL);
        TrafficLight tr3 = factory.createTrafficLight(TypesTrafficLightBase.T8);
        TrafficLight tr4 = factory.createTrafficLight(TypesTrafficLightBase.T5);
        TrafficLight tr5 = factory.createTrafficLight(TypesTrafficLightBase.T10);

        NetworkOfTrafficLights lineTrafficLight = new NetworkOfTrafficLights();

        lineTrafficLight.addTrafficLight(tr1);
        lineTrafficLight.addTrafficLight(tr2);
        lineTrafficLight.addTrafficLight(tr3);
        lineTrafficLight.addTrafficLight(tr4);
        lineTrafficLight.addTrafficLight(tr5);

        while (true){
            for (int i = 0; i < 10; i++) {
                lineTrafficLight.update();
                lineTrafficLight.printLog();
                System.out.println();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            break;
        }
    }
}