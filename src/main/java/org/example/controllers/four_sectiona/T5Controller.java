package org.example.controllers.four_sectiona;

import org.example.enums.TypesTrafficLightBase;

public class T5Controller extends FourSectionalController{

    @Override
    public String getPattern() {
        return TypesTrafficLightBase.T5.getPattern();
    }

}
