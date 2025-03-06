package org.example.states.two_sectional;

import org.example.Configuration;
import org.example.controllers.two_sectional.TwoSectionalController;

public class BottomState implements TrafficLight2SectionalState {

    @Override
    public void changeState(TwoSectionalController controller) throws InterruptedException {
        controller.getLedBottom().turnOff();
        controller.getLedTop().turnOn();
        Thread.sleep(Configuration.getSpeedAnimation(2000));
        controller.setState(new TopState());
        System.out.println("STOP");
    }
}
