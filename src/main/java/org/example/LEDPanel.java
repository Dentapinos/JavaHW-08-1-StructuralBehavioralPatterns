package org.example;

import org.example.enums.ColorsLEDPanel;

public class LEDPanel {
    public ColorsLEDPanel color;
    int quantityDiodes;
    public boolean state;
    int number;

    public LEDPanel(ColorsLEDPanel color, int quantityDiodes, int number) {
        this.color = color;
        this.quantityDiodes = quantityDiodes;
        this.number = number;
    }

    public void turnOn(){
        state = true;
    }
    public void turnOff(){
        state = false;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
