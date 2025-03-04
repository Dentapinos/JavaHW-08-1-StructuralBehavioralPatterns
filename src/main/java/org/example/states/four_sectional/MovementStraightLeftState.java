package org.example.states.four_sectional;

import org.example.controllers.four_sectiona.FourSectionalController;

public class MovementStraightLeftState implements TrafficLight4SectionalState {

    @Override
    public void changeState(FourSectionalController controller) {
        controller.getLedTopLeft().turnOn();
        controller.getLedTopCenter().turnOn();
        controller.getLedTopRight().turnOff();

        controller.getLedBottom().turnOn();

       controller.setState(new MovementRightState());
    }
}
