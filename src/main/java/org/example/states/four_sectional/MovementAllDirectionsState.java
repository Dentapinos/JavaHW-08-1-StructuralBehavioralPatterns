package org.example.states.four_sectional;

import org.example.Configuration;
import org.example.controllers.four_sectiona.FourSectionalController;

public class MovementAllDirectionsState implements TrafficLight4SectionalState {

    @Override
    public void changeState(FourSectionalController controller) throws InterruptedException {
        controller.getLedTopLeft().turnOn();
        controller.getLedTopCenter().turnOn();
        controller.getLedTopRight().turnOn();

        controller.getLedBottom().turnOn();
        Thread.sleep(Configuration.getSpeedAnimation(2000));
        controller.setState(new MovementProhibitionState());
        System.out.println("GO ALL DIRECTIONS");
    }
}
