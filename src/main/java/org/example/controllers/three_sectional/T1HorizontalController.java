package org.example.controllers.three_sectional;

import org.example.enums.TypesTrafficLightBase;

public class T1HorizontalController extends ThreeSectionalController {

    @Override
    public String getPattern() {
        return TypesTrafficLightBase.T1_VERTICAL.getPattern();

    }
}
