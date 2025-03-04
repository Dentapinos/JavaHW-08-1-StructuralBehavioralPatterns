package org.example.controllers.two_sectional;

import org.example.enums.TypesTrafficLightBase;

public class T8VerticalController extends TwoSectionalController {

    @Override
    public String getPattern() {
        return TypesTrafficLightBase.T8.getPattern();
    }

}
