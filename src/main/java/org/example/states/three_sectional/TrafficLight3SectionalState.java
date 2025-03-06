package org.example.states.three_sectional;

import org.example.controllers.three_sectional.ThreeSectionalController;

public interface TrafficLight3SectionalState {
    void changeState(ThreeSectionalController controller) throws InterruptedException;
}
