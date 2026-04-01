package de.bcxp.challenge;

import java.util.List;

public final class App {

    public static void main(String... args) {
        Operator operator = new Operator();

        String dayWithSmallestTempSpread = operator.computeWeatherOperation();     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread: %s%n", dayWithSmallestTempSpread);

        String countryWithHighestPopulationDensity = operator.computeCountryOperation(); // Your population density analysis function call …
        System.out.printf("Country with highest population density: %s%n", countryWithHighestPopulationDensity);
    }
}
