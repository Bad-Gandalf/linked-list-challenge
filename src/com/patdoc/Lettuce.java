package com.patdoc;

public class Lettuce {

    private boolean required;

    public Lettuce(boolean required) {
        this.required = required;
    }

    public double getPRICE() {
        if (required){
            return 0.10d;
        }else {
            return 0.00d;
        }

    }

    public boolean isRequired() {
        return required;
    }
}
