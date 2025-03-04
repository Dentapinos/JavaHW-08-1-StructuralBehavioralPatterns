package org.example.lights;

import org.example.enums.TypesTrafficLightBase;

public interface Factory {
   TrafficLight createTrafficLight(TypesTrafficLightBase type);
}
