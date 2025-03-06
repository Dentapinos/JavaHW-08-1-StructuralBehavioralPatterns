package org.example;

public class Configuration {
    static double speedAnimation = 0.2;

    public Configuration(double speedAnimation) {
        Configuration.speedAnimation = speedAnimation;
    }

    public static int getSpeedAnimation(int sleep) {
        return (int)(speedAnimation * sleep);
    }
}
