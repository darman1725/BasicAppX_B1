package org.aplas.basicappx;

public class Distance {
    private double meter;

    public Distance(){
        meter = 0;
    }

    public void setMeter(double meter){
        this.meter = meter;
    }

    public void setInch(double meter){
        this.meter = convert("Inc", "Mtr", meter);
    }

    public void setMile(double meter){
        this.meter = convert("Mil", "Mtr", meter);
    }

    public void setFoot(double meter){
        this.meter = convert("Ft", "Mtr", meter);
    }

}
