package org.example.states.four_sectional;

import org.example.Configuration;
import org.example.controllers.four_sectiona.FourSectionalController;

public class MovementProhibitionState implements TrafficLight4SectionalState {

    int count = 0;

    @Override
    public void changeState(FourSectionalController controller) throws InterruptedException {
        controller.getLedTopLeft().turnOn();
        controller.getLedTopCenter().turnOn();
        controller.getLedTopRight().turnOn();

        controller.getLedBottom().turnOff();
        Thread.sleep(Configuration.getSpeedAnimation(2000));
        if (count == 0){
            controller.setState(new MovementStraightState());

        } else if (count == 1){
            controller.setState(new MovementStraightLeftState());

        } else {
            controller.setState(new MovementLeftRightState());

        }
        System.out.println("STOP");
        count++;

        if (count == 2){
            count = 0;
        }

    }
}
