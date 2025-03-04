package org.example.lights;


import org.example.LEDPanel;
import org.example.controllers.ControllerTrafficLight;
import org.example.enums.ColorsLEDPanel;
import org.example.schemes.Scheme;
import org.example.schemes.T5Scheme;

import java.util.ArrayList;

public class T5 extends TrafficLight{

    public T5(ControllerTrafficLight controller) {
        super(controller);
    }

    @Override
    void installPanels() {
        ArrayList<LEDPanel> panels = new ArrayList<>();
        panels.add(new LEDPanel(ColorsLEDPanel.BRIGHT_WHITE, 300, 1));
        panels.add(new LEDPanel(ColorsLEDPanel.BRIGHT_WHITE, 300, 2));
        panels.add(new LEDPanel(ColorsLEDPanel.BRIGHT_WHITE, 300, 3));
        panels.add(new LEDPanel(ColorsLEDPanel.BRIGHT_WHITE, 300, 4));
        super.ledPanels = panels;
        super.controller.addPanels(panels);
    }

    @Override
    String createName() {
        return "T5";
    }

    @Override
    Scheme createScheme() {
        return new T5Scheme();
    }
}
