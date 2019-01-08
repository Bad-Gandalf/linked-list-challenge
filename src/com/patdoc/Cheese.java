package com.patdoc;

public class Cheese {

    private boolean required;

    public Cheese(boolean required) {
        this.required = required;
    }

    public double getPRICE() {
        if (required){
            return 0.30d;
        }else {
            return 0.00d;
        }
    }

    public boolean isRequired() {
        return required;
    }
}
