package org.example.enums;

public enum ColorsLEDPanel {
    RED("красный", "\u001b[31m"),
    GREEN("зеленый", "\u001b[32m"),
    YELLOW("желтый", "\u001b[33m"),
    BRIGHT_WHITE("ярко-белый", "\u001b[97m"),
    WHITE("белый", "\u001b[38;5;8m");

    private final String color;
    private final String colorESC;

    ColorsLEDPanel(String color, String colorESC) {
        this.color = color;
        this.colorESC = colorESC;
    }

    public String getColor() {
        return color;
    }

    public String getColorESC() {
        return colorESC;
    }
}
