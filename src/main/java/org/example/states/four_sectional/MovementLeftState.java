package org.example.states.four_sectional;

import org.example.Configuration;
import org.example.controllers.four_sectiona.FourSectionalController;

public class MovementLeftState implements TrafficLight4SectionalState {

    @Override
    public void changeState(FourSectionalController controller) throws InterruptedException {
        controller.getLedTopLeft().turnOn();
        controller.getLedTopCenter().turnOff();
        controller.getLedTopRight().turnOff();

        controller.getLedBottom().turnOn();
        Thread.sleep(Configuration.getSpeedAnimation(2000));
        System.out.println("GO LEFT");
    }

}
