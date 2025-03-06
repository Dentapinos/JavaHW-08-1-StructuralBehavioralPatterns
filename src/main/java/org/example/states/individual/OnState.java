package org.example.states.individual;

import org.example.Configuration;
import org.example.controllers.individual.SingleController;

public class OnState implements IndividualState {

    @Override
    public void changeState(SingleController controller) throws InterruptedException {
        controller.getLedPanel().turnOff();
        Thread.sleep(Configuration.getSpeedAnimation(3000));
        controller.setState(new OffState());
        System.out.println("STOP");
    }
}
