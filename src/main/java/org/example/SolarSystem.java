package org.example;

public enum SolarSystem
{
    MERCURY(0, 2439),
    VENUS(100, 6051, MERCURY),
    EARTH(200, 6371, VENUS),
    MARS(300,  3389, EARTH),
    JUPITER(400, 69911, MARS),
    SATURN(500, 58232, JUPITER),
    URANUS(600, 25362, SATURN),
    NEPTUNE(700, 24_622, URANUS);
    ;

    final public int num; // порядковий номер планети
    final public int prevDistance; // Віддаленість від попередньої планети
    final public int radius; // Радіус
    final public int sunDistance; // Віддаленість від сонця
    final public SolarSystem previousPlanet; // Попередня планета
    private SolarSystem nextPlanet; // Наступна планета

    SolarSystem(int prevDistance, int radius, SolarSystem previous) {
        this.prevDistance = prevDistance;
        this.radius = radius;
        if (previous == null) {
            this.num = 1;
            this.sunDistance = 100;
            this.previousPlanet = null;
        } else {
            this.num = previous.num + 1;
            this.sunDistance = previous.sunDistance + prevDistance;
            this.previousPlanet = previous;
            this.previousPlanet.nextPlanet = this;
        }
    }

    SolarSystem(int prevDistance, int radius) {
        this(prevDistance, radius, null);
    }


    public int getDistanceFromSun() {
        return sunDistance;
    }

    public int getRadius() {
        return radius;
    }

    public SolarSystem getPreviousPlanet() {
        return previousPlanet;
    }

    public SolarSystem getNextPlanet() {
        return nextPlanet;
    }
}
