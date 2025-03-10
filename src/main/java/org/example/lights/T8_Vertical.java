package org.example.lights;

import org.example.LEDPanel;
import org.example.controllers.ControllerTrafficLight;
import org.example.enums.ColorsLEDPanel;
import org.example.enums.TypesTrafficLightBase;
import org.example.schemes.Scheme;
import org.example.schemes.T8VerticalScheme;

import java.util.ArrayList;

public class T8_Vertical extends TrafficLight {

    public T8_Vertical(ControllerTrafficLight controller) {
        super(controller);
    }

    @Override
    public void installPanels(){
        ArrayList<LEDPanel> panels = new ArrayList<>();
        panels.add(new LEDPanel(ColorsLEDPanel.RED, 300, 1));
        panels.add(new LEDPanel(ColorsLEDPanel.GREEN, 300, 2));
        super.ledPanels = panels;
        super.controller.addPanels(panels);
    }

    @Override
    void createName() {
        name = "T8Vertical";
    }

    @Override
    void createDescription() {
        description = TypesTrafficLightBase.T8.getDescription();
    }

    @Override
    void createScheme() {
        scheme = new T8VerticalScheme();
    }
}
