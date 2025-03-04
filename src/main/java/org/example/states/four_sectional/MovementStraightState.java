package org.example.states.four_sectional;

import org.example.controllers.four_sectiona.FourSectionalController;

public class MovementStraightState implements TrafficLight4SectionalState {

    @Override
    public void changeState(FourSectionalController controller) {
        controller.getLedTopLeft().turnOff();
        controller.getLedTopCenter().turnOn();
        controller.getLedTopRight().turnOff();

        controller.getLedBottom().turnOn();

        controller.setState(new MovementStraightLeftState());
    }
}
