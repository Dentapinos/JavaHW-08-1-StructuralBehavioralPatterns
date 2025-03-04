package org.example.states.three_sectional;

import org.example.controllers.three_sectional.ThreeSectionalController;

public class GreenAfterYellowState implements TrafficLight3SectionalState {

    @Override
    public void changeState(ThreeSectionalController controller) {
        controller.getLedBottom().turnOff();
        controller.getLedCenter().turnOn();

        controller.setState(new YellowAfterGreenState());
    }
}
