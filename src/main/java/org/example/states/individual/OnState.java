package org.example.states.individual;

import org.example.controllers.individual.SingleController;

public class OnState implements IndividualState {

    @Override
    public void changeState(SingleController controller) {
        controller.getLedPanel().turnOff();
        controller.setState(new OffState());
    }
}
