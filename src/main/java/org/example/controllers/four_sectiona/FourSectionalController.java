package org.example.controllers.four_sectiona;

import org.example.LEDPanel;
import org.example.controllers.ControllerTrafficLight;
import org.example.states.four_sectional.*;

import java.util.ArrayList;

public abstract class FourSectionalController implements ControllerTrafficLight {
    LEDPanel ledTopLeft;
    LEDPanel ledTopCenter;
    LEDPanel ledTopRight;
    LEDPanel ledBottom;

    TrafficLight4SectionalState state;
    int flag = 1;


    public FourSectionalController() {
        this.state = new MovementProhibitionState();
    }

    @Override
    public void update() {
        if (flag != 1){
            state.changeState(this);
            flag = 1;
        } else {
            flag = 2;
        }
    }

    public LEDPanel getLedTopLeft() {
        return ledTopLeft;
    }

    public LEDPanel getLedTopCenter() {
        return ledTopCenter;
    }

    public LEDPanel getLedTopRight() {
        return ledTopRight;
    }

    public LEDPanel getLedBottom() {
        return ledBottom;
    }

    public void setState(TrafficLight4SectionalState state) {
        this.state = state;
    }

    @Override
    public void addPanels(ArrayList<LEDPanel> ledPanels){
        ledTopLeft = ledPanels.get(0);
        ledTopCenter = ledPanels.get(1);
        ledTopRight = ledPanels.get(2);
        ledBottom = ledPanels.get(3);
    }
}
