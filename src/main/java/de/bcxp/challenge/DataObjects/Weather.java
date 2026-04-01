package de.bcxp.challenge.DataObjects;

public class Weather{
    int day;
    double maxTemp;
    double minTemp;
    double tempSpread;
    //including the other attributes is probably not necessary for this exercise
    
    public Weather(Builder builder){
        this.day = builder.day;
        this.maxTemp = builder.maxTemp;
        this.minTemp = builder.minTemp;
        this.tempSpread = builder.tempSpread;
    }

    public int getDay(){return day;}
    public double getMaxTemp(){return maxTemp;}
    public double getMinTemp(){return minTemp;}
    public double getTempSpread(){return tempSpread;}

    public static class Builder{
        private int day;
        private double maxTemp;
        private double minTemp;
        private double tempSpread;
        

        public Builder day (int day){
            this.day = day;
            return this;
        }
        public Builder maxTemp (double maxTemp){
            this.maxTemp = maxTemp;
            return this;
        }
        public Builder minTemp (double minTemp){
            this.minTemp = minTemp;
            return this;
        }
        public Weather build() {
            this.tempSpread = maxTemp - minTemp;
            return new Weather(this);
        }
    }    
}