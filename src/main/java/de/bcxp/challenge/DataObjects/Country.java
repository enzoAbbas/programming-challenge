package de.bcxp.challenge.DataObjects;

public class Country{
    String name;
    int population;
    double area;
    double density; 
    //including the other attributes is probably not necessary for this exercise

    public Country(Builder builder){
        this.name = builder.name;
        this.population = builder.population;
        this.area = builder.area;
        this.density = builder.density;
    }
    
    public String getName(){return name;}
    public int getPopulation(){return population;}
    public double getArea(){return area;}
    public double getDensity(){return density;}

    public static class Builder {
        private String name;
        private int population;
        private double area;
        private double density;

        public Builder name (String name){
            this.name = name;
            return this;
        }
        public Builder population (int population){
            this.population = population;
            return this;
        }
        public Builder area (double area){
            this.area = area;
            return this;
        }
        public Country build() {
            this.density = population/area;
            return new Country(this);
        }
    }

}