package org.example.controllers.individual;

import org.example.enums.TypesTrafficLightBase;

public class T10Controller extends SingleController {

    @Override
    public String getPattern() {
        return TypesTrafficLightBase.T10.getPattern();
    }

}
