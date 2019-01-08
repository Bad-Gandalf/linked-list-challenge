package com.patdoc;

public class Drink {
    private boolean required;

    public Drink(boolean required) {
        this.required = required;
    }

    public double getPRICE() {
        if (required){
            return 1.30d;
        }else {
            return 0.00d;
        }

    }

    public boolean isRequired() {
        return required;
    }
}
