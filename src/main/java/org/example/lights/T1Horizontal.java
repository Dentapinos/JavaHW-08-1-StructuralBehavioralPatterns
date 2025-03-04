package org.example.lights;


import org.example.LEDPanel;
import org.example.controllers.ControllerTrafficLight;
import org.example.enums.ColorsLEDPanel;
import org.example.schemes.Scheme;
import org.example.schemes.T1HorizontalScheme;

import java.util.ArrayList;

public class T1Horizontal extends TrafficLight{

    public T1Horizontal(ControllerTrafficLight controller) {
        super(controller);
    }

    @Override
    void installPanels() {
        ArrayList<LEDPanel> panels = new ArrayList<>();
        panels.add(new LEDPanel(ColorsLEDPanel.RED, 300, 1));
        panels.add(new LEDPanel(ColorsLEDPanel.YELLOW, 300, 2));
        panels.add(new LEDPanel(ColorsLEDPanel.GREEN, 300, 3));
        super.ledPanels = panels;
        super.controller.addPanels(panels);
    }

    @Override
    String createName() {
        return "T1Horizontal";
    }

    @Override
    Scheme createScheme() {
        return new T1HorizontalScheme();
    }
}
