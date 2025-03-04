package org.example.states.four_sectional;

import org.example.controllers.four_sectiona.FourSectionalController;

public class MovementAllDirectionsState implements TrafficLight4SectionalState {

    @Override
    public void changeState(FourSectionalController controller) {
        controller.getLedTopLeft().turnOn();
        controller.getLedTopCenter().turnOn();
        controller.getLedTopRight().turnOn();

        controller.getLedBottom().turnOn();

        controller.setState(new MovementProhibitionState());
    }
}
