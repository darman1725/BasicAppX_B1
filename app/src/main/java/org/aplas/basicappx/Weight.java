package org.aplas.basicappx;

public class Weight {
    private double gram;

    public Weight(){
        gram = 0;
    }

    public void setGram(double gram){
        this.gram = gram;
    }

    public void setOunce(double gram){
        this.gram = convert("Onc", "Grm", gram);
    }

    public void setPound(double gram){
        this.gram = convert("Pnd", "Grm", gram);
    }


}
