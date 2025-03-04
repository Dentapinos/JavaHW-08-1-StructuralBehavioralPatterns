package org.example.controllers;

import org.example.LEDPanel;
import org.example.Network;

import java.util.ArrayList;

public interface ControllerTrafficLight extends Network {

    String getPattern();
    void addPanels(ArrayList<LEDPanel> ledPanels);
}
