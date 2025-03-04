package org.example;

import org.example.lights.TrafficLight;

import java.util.ArrayList;

public class NetworkOfTrafficLights implements Network{
    ArrayList<TrafficLight> trafficLights;

    public NetworkOfTrafficLights() {
        this.trafficLights = new ArrayList<>();
    }

    @Override
    public void update() {
        for (TrafficLight trafficLights : trafficLights){
            trafficLights.getController().update();
        }
    }

    public void addTrafficLight(TrafficLight trafficLight) {
        trafficLights.add(trafficLight);
    }

    void printLog(){
        for (TrafficLight trafficLights : trafficLights){
            System.out.println(trafficLights.getName());
            trafficLights.getLogger().print();
        }
    }
}
