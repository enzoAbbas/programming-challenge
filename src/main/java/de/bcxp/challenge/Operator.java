package de.bcxp.challenge;

import java.util.List;

import de.bcxp.challenge.DataObjects.Country;
import de.bcxp.challenge.DataObjects.Weather;
import de.bcxp.challenge.Reader.CountryReader;
import de.bcxp.challenge.Reader.WeatherReader;

public class Operator {
    public String computeWeatherOperation(){
        WeatherReader reader = new WeatherReader();
        List<Weather> listOfWeather = reader.readDocument();
        Weather minSpreadDay = listOfWeather.get(0);

        for(Weather element : listOfWeather){
            if (element.getTempSpread() < minSpreadDay.getTempSpread()){
                minSpreadDay = element;
            }
        }
        String day = Integer.toString(minSpreadDay.getDay());
        return day;
    }

    public String computeCountryOperation(){
        CountryReader reader = new CountryReader();
        List<Country> listOfCountries = reader.readDocument();
        Country maxPopulationDensity = listOfCountries.get(0);

        for(Country element : listOfCountries){
            if (element.getDensity() > maxPopulationDensity.getDensity()){
                maxPopulationDensity = element;
            }
        }
        return maxPopulationDensity.getName();
    }
}
