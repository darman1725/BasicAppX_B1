package org.aplas.basicappx;

public class Temperature {
    private double celcius;

    Temperature(){
        this.celcius = 0;
    }

    public void setCelcius(double celci){
        this.celcius = celci;
    }
    public void setFahrenheit(double farenheit){
        this.celcius = convert("°F", "°C", farenheit);
    }
    public void setKelvins(double kelvin){
        this.celcius = convert("K", "°C", kelvin);
    }


}

