package org.example.states.three_sectional;

import org.example.Configuration;
import org.example.controllers.three_sectional.ThreeSectionalController;

public class GreenAfterYellowState implements TrafficLight3SectionalState {

    @Override
    public void changeState(ThreeSectionalController controller) throws InterruptedException {
        controller.getLedBottom().turnOff();
        controller.getLedCenter().turnOn();

        Thread.sleep(Configuration.getSpeedAnimation(3000));
        controller.setState(new YellowAfterGreenState());
        System.out.println("CAUTION");
    }
}
