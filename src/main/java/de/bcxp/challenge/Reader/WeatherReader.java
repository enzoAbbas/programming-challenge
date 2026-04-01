package de.bcxp.challenge.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import de.bcxp.challenge.DataObjects.Weather;

public class WeatherReader {
    LinkedList<Weather> listOfWeather = new LinkedList<>();

    public LinkedList<Weather> readDocument(){
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/de/bcxp/challenge/weather.csv"))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int day = Integer.parseInt(values[0]);
                double minTemp = Double.parseDouble(values[1]);
                double maxTemp = Double.parseDouble(values[2]);

                Weather weatherData = new Weather.Builder()
                    .day(day)
                    .minTemp(minTemp)
                    .maxTemp(maxTemp)
                    .build();

                listOfWeather.add(weatherData);

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return listOfWeather;
    }
}
