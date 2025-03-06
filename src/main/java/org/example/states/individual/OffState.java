package org.example.states.individual;

import org.example.Configuration;
import org.example.controllers.individual.SingleController;

public class OffState implements IndividualState {

    @Override
    public void changeState(SingleController controller) throws InterruptedException {
        controller.getLedPanel().turnOn();
        Thread.sleep(Configuration.getSpeedAnimation(2000));
        controller.setState(new OnState());
        System.out.println("GO");
    }
}
