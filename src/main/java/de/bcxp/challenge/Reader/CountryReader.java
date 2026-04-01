package de.bcxp.challenge.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import de.bcxp.challenge.DataObjects.Country;

public class CountryReader {
    LinkedList<Country> listOfCountries = new LinkedList<>();

    public LinkedList<Country> readDocument(){
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/de/bcxp/challenge/countries.csv"))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                String name = values[0];
                String populationData = values[3].replace(".", "").replace(",", ".");
                double parsedPopulation = Double.parseDouble(populationData); 
                int population = (int) parsedPopulation;   
                String rawArea = values[4].replace(".", "").replace(",", ".");
                double area = Double.parseDouble(rawArea);

                Country countryData = new Country.Builder()
                    .name(name)
                    .population(population)
                    .area(area)
                    .build();

                listOfCountries.add(countryData);

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return listOfCountries;
    }
}
