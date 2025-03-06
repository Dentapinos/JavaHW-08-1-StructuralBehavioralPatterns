package org.example.controllers.three_sectional;

import org.example.LEDPanel;
import org.example.controllers.ControllerTrafficLight;
import org.example.states.three_sectional.RedAfterYellowState;
import org.example.states.three_sectional.TrafficLight3SectionalState;

import java.util.ArrayList;

public abstract class ThreeSectionalController implements ControllerTrafficLight {
    LEDPanel ledTop;
    LEDPanel ledCenter;
    LEDPanel ledBottom;

    TrafficLight3SectionalState state;

    public ThreeSectionalController() {
        this.state = new RedAfterYellowState();
    }

    @Override
    public void run() throws InterruptedException {
        state.changeState(this);
    }

    public LEDPanel getLedTop() {
        return ledTop;
    }

    public LEDPanel getLedCenter() {
        return ledCenter;
    }

    public LEDPanel getLedBottom() {
        return ledBottom;
    }

    public void setState(TrafficLight3SectionalState state) {
        this.state = state;
    }

    @Override
    public void addPanels(ArrayList<LEDPanel> ledPanels){
        ledTop = ledPanels.get(0);
        ledCenter = ledPanels.get(1);
        ledBottom = ledPanels.get(2);
    }
}
