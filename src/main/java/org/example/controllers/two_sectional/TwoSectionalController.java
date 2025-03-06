package org.example.controllers.two_sectional;

import org.example.LEDPanel;
import org.example.controllers.ControllerTrafficLight;
import org.example.states.two_sectional.TopState;
import org.example.states.two_sectional.TrafficLight2SectionalState;

import java.util.ArrayList;

public abstract class TwoSectionalController implements ControllerTrafficLight {
    LEDPanel ledTop;
    LEDPanel ledBottom;

    TrafficLight2SectionalState state;

    public TwoSectionalController() {
        this.state = new TopState();
    }

    @Override
    public void run() {
        try {
            state.changeState(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setState(TrafficLight2SectionalState state) {
        this.state = state;
    }

    public LEDPanel getLedTop() {
        return ledTop;
    }

    public LEDPanel getLedBottom() {
        return ledBottom;
    }

    @Override
    public void addPanels(ArrayList<LEDPanel> ledPanels){
        ledTop = ledPanels.get(0);
        ledBottom = ledPanels.get(1);
    }
}
