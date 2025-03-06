package org.example.states.three_sectional;

import org.example.Configuration;
import org.example.controllers.three_sectional.ThreeSectionalController;

public class YellowAfterRedState implements TrafficLight3SectionalState {

    @Override
    public void changeState(ThreeSectionalController controller) throws InterruptedException {
        controller.getLedCenter().turnOff();
        controller.getLedBottom().turnOn();
        Thread.sleep(Configuration.getSpeedAnimation(3000));
        controller.setState(new GreenAfterYellowState());
        System.out.println("GO");
    }
}
