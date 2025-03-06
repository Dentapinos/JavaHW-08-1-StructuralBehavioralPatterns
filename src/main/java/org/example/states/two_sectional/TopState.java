package org.example.states.two_sectional;

import org.example.Configuration;
import org.example.controllers.two_sectional.TwoSectionalController;

public class TopState implements TrafficLight2SectionalState {

    @Override
    public void changeState(TwoSectionalController controller) throws InterruptedException {
        controller.getLedBottom().turnOn();
        controller.getLedTop().turnOff();
        Thread.sleep(Configuration.getSpeedAnimation(3000));
        controller.setState(new BottomState());
        System.out.println("GO");
    }
}
