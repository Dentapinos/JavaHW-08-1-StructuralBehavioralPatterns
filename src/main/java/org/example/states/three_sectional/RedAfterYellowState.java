package org.example.states.three_sectional;

import org.example.controllers.three_sectional.ThreeSectionalController;

public class RedAfterYellowState implements TrafficLight3SectionalState {

    @Override
    public void changeState(ThreeSectionalController controller) {
        controller.getLedTop().turnOff();
        controller.getLedCenter().turnOn();

        controller.setState(new YellowAfterRedState());
    }
}
