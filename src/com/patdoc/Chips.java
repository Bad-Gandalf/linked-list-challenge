package com.patdoc;

public class Chips {
    private boolean required;

    public Chips(boolean required) {
        this.required = required;
    }

    public double getPRICE() {
        if (required){
            return 1.50d;
        }else {
            return 0.00d;
        }

    }

    public boolean isRequired() {
        return required;
    }
}
