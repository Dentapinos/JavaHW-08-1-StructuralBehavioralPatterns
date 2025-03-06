package org.example.states.three_sectional;

import org.example.Configuration;
import org.example.controllers.three_sectional.ThreeSectionalController;

public class RedAfterYellowState implements TrafficLight3SectionalState {

    @Override
    public void changeState(ThreeSectionalController controller) throws InterruptedException {
        controller.getLedTop().turnOff();
        controller.getLedCenter().turnOn();
        Thread.sleep(Configuration.getSpeedAnimation(4000));
        controller.setState(new YellowAfterRedState());
        System.out.println("CAUTION");
    }
}
