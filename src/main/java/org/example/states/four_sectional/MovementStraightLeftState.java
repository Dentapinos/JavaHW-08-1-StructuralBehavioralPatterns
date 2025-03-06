package org.example.states.four_sectional;

import org.example.Configuration;
import org.example.controllers.four_sectiona.FourSectionalController;

public class MovementStraightLeftState implements TrafficLight4SectionalState {

    @Override
    public void changeState(FourSectionalController controller) throws InterruptedException {
        controller.getLedTopLeft().turnOn();
        controller.getLedTopCenter().turnOn();
        controller.getLedTopRight().turnOff();

        controller.getLedBottom().turnOn();
        Thread.sleep(Configuration.getSpeedAnimation(2000));
        controller.setState(new MovementRightState());
        System.out.println("GO STRAIGHT AND LEFT");
    }
}
