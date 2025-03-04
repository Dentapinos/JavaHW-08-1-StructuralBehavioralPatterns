package org.example.states.three_sectional;

import org.example.controllers.three_sectional.ThreeSectionalController;

public class YellowAfterGreenState implements TrafficLight3SectionalState {

    @Override
    public void changeState(ThreeSectionalController controller) {
        controller.getLedCenter().turnOff();
        controller.getLedTop().turnOn();

        controller.setState(new RedAfterYellowState());
    }
}
