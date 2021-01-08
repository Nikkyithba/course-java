package com.nikky.javabasics;

public class Software extends Product{

    private double version;

    public Software(String co, String de, double pr, double ve){
        super("AAAA", "product",0.0);
        version=ve;
        count++;

    }

    public Software(){
        super();
        count ++;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}


