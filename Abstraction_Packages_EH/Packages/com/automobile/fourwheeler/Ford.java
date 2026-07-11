package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle{
    public String getModelName(){
        return "Ford EcoSport";
    }

    public String getRegistrationNumber(){
        return "TS09GH2222";
    }

    public String getOwnerName(){
        return "Kiran";
    }

    public int speed(){
        return 140;
    }

    public int tempControl(){
        return 22;
    }
}