package org.example.states.four_sectional;

import org.example.controllers.four_sectiona.FourSectionalController;

public class MovementLeftState implements TrafficLight4SectionalState {

    @Override
    public void changeState(FourSectionalController controller) {
        controller.getLedTopLeft().turnOn();
        controller.getLedTopCenter().turnOff();
        controller.getLedTopRight().turnOff();

        controller.getLedBottom().turnOn();
    }

}
