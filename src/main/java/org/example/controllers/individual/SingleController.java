package org.example.controllers.individual;

import org.example.LEDPanel;
import org.example.controllers.ControllerTrafficLight;
import org.example.states.individual.IndividualState;
import org.example.states.individual.OffState;

import java.util.ArrayList;

public abstract class SingleController implements ControllerTrafficLight {
    LEDPanel ledPanel;

    IndividualState state;

    public SingleController() {
        this.state = new OffState();
    }

    @Override
    public void update() {
        state.changeState(this);
    }

    public void setState(IndividualState state) {
        this.state = state;
    }

    public LEDPanel getLedPanel() {
        return ledPanel;
    }

    @Override
    public void addPanels(ArrayList<LEDPanel> ledPanels){
        ledPanel = ledPanels.getFirst();
    }
}
