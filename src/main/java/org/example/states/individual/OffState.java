package org.example.states.individual;

import org.example.controllers.individual.SingleController;

public class OffState implements IndividualState {

    @Override
    public void changeState(SingleController controller) {
        controller.getLedPanel().turnOn();
        controller.setState(new OnState());
    }
}
