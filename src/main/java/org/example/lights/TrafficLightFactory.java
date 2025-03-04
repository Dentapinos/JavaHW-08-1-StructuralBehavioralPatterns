package org.example.lights;

import org.example.controllers.four_sectiona.T5Controller;
import org.example.controllers.individual.T10Controller;
import org.example.controllers.three_sectional.T1VerticalController;
import org.example.controllers.two_sectional.T8VerticalController;
import org.example.enums.TypesTrafficLightBase;

public class TrafficLightFactory implements Factory{

    public TrafficLight createTrafficLight(TypesTrafficLightBase type) {
        if (type.equals(TypesTrafficLightBase.T1_VERTICAL)){
            return new T1Vertical(new T1VerticalController());
        } else if (type.equals(TypesTrafficLightBase.T1_HORIZONTAL)){
            return new T1Horizontal(new T1VerticalController());
        } else if (type.equals(TypesTrafficLightBase.T8)){
            return new T8_Vertical(new T8VerticalController());
        } else if (type.equals(TypesTrafficLightBase.T5)) {
            return new T5(new T5Controller());
        } else if (type.equals(TypesTrafficLightBase.T10)) {
            return new T10(new T10Controller());
        }
        return null;
    }
}
