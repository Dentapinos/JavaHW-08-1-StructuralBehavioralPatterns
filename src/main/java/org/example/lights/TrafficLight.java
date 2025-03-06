package org.example.lights;

import org.example.LEDPanel;
import org.example.LoggerTrafficLight;
import org.example.controllers.ControllerTrafficLight;
import org.example.schemes.Scheme;

import java.util.ArrayList;

public abstract class TrafficLight {
    String name;
    String description;
    Scheme scheme;
    ArrayList<LEDPanel> ledPanels;
    ControllerTrafficLight controller;
    LoggerTrafficLight logger;

    public TrafficLight(ControllerTrafficLight controller) {
        this.controller = controller;
        createName();
        createScheme();
        createDescription();
        installPanels();
        logger = new LoggerTrafficLight(this);
    }

    public void startTrafficLight(){
        int count = 10;
        System.out.println("Traffic Light " + name + " - " + description);
        while (count > 0) {
            try {
                controller.run();
                logger.print();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println();
            count--;
        }
    }

    abstract void installPanels();

    public ControllerTrafficLight getController() {
        return controller;
    }

    abstract void createName();
    abstract void createDescription();
    abstract void createScheme();

    public void addPanel(LEDPanel panel) {
        for (LEDPanel ledPanel : ledPanels) {
            if (ledPanel.getNumber() == panel.getNumber()) {
                ledPanels.remove(ledPanel);
                ledPanels.add(panel);
                break;
            }
        }

    }

    public void removePanel(int number){
        for (LEDPanel ledPanel : ledPanels) {
            if (ledPanel.getNumber() == number) {
                ledPanels.remove(ledPanel);
                break;
            }
        }
    }

    public ArrayList<LEDPanel> getLedPanels() {
        return ledPanels;
    }

    public String getName() {
        return name;
    }

    public Scheme getScheme() {
        return scheme;
    }

    public LoggerTrafficLight getLogger() {
        return logger;
    }
}
