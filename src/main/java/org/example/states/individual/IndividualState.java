package org.example.states.individual;

import org.example.controllers.individual.SingleController;

public interface IndividualState {
    void changeState(SingleController controller);
}
