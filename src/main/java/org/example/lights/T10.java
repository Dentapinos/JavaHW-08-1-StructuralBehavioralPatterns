package org.example.lights;

import org.example.LEDPanel;
import org.example.controllers.ControllerTrafficLight;
import org.example.enums.ColorsLEDPanel;
import org.example.enums.TypesTrafficLightBase;
import org.example.schemes.Scheme;
import org.example.schemes.T10Scheme;

import java.util.ArrayList;

public class T10 extends TrafficLight {

    public T10(ControllerTrafficLight controller) {
        super(controller);
    }

    @Override
    public void installPanels(){
        ArrayList<LEDPanel> panels = new ArrayList<>();
        panels.add(new LEDPanel(ColorsLEDPanel.YELLOW, 300, 1));
        super.ledPanels = panels;
        super.controller.addPanels(panels);
    }

    @Override
    void createName() {
        name =  "T10";
    }

    @Override
    void createDescription() {
        description = TypesTrafficLightBase.T10.getDescription();
    }

    @Override
    void createScheme() {
        scheme = new T10Scheme();
    }
}
