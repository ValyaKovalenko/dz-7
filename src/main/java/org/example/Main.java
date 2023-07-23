package org.example;

public class Main {
    public static void main(String[] args) {
        SolarSystem planet = SolarSystem.EARTH;
        System.out.println("Планета: " + planet);
        System.out.println("Відстань від сонця: " + planet.getDistanceFromSun() + " км");
        System.out.println("Радіус: " + planet.getRadius() + " км");
        System.out.println("Попередня планета: " + planet.getPreviousPlanet());
        System.out.println("Наступна планета: " + planet.getNextPlanet());
    }
}
