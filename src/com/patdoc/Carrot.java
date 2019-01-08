package com.patdoc;

public class Carrot {

    private boolean required;

    public Carrot(boolean required) {
        this.required = required;
    }

    public double getPRICE() {
        if (required){
            return 0.15d;
        }else {
            return 0.00d;
        }
    }

    public boolean isRequired() {
        return required;
    }
}
