package org.example;

import org.example.enums.ColorsLEDPanel;
import org.example.lights.TrafficLight;

import java.util.List;

public class LoggerTrafficLight {
    String img;
    TrafficLight trafficLight;

    public LoggerTrafficLight(TrafficLight trafficLight) {
        this.img = trafficLight.getController().getPattern();
        this.trafficLight = trafficLight;
    }

    public void print(){
        System.out.print(visualize());
    }

    private String visualize(){
        String a = "";
        for (List<Integer> list: trafficLight.getScheme().getScheme()){
            for (int i: list){
                if (i == 0){
                    a += " ".repeat(img.length());
                } else {
                    LEDPanel lp = getNeedPanel(i);
                    if (lp.state){
                        a += lp.color.getColorESC() + img + "\u001b[0m";
                    } else {
                        a += ColorsLEDPanel.WHITE.getColorESC() + img + "\u001b[0m";
                    }
                }
            }
            a+="\n";
        }
        return a;
    }


    private LEDPanel getNeedPanel(int number){
        for (LEDPanel panel: trafficLight.getLedPanels()){
            if(panel.getNumber() == number){
                return panel;
            }
        }
        return null;
    }

}
