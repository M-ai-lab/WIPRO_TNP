package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle{
    public String getModelName(){
        return "Mahindra Logan";
    }

    public String getRegistrationNumber(){
        return "TS09EF1111";
    }

    public String getOwnerName(){
        return "Ravi";
    }

    public int speed(){
        return 120;
    }

    public int gps(){
        return 1;
    }
}