package org.example.states.two_sectional;

import org.example.controllers.two_sectional.TwoSectionalController;

public class TopState implements TrafficLight2SectionalState {

    @Override
    public void changeState(TwoSectionalController controller) {
        controller.getLedBottom().turnOn();
        controller.getLedTop().turnOff();

        controller.setState(new BottomState());
    }
}
