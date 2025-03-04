package org.example.states.two_sectional;

import org.example.controllers.two_sectional.TwoSectionalController;

public class BottomState implements TrafficLight2SectionalState {

    @Override
    public void changeState(TwoSectionalController controller) {
        controller.getLedBottom().turnOff();
        controller.getLedTop().turnOn();

        controller.setState(new TopState());
    }
}
