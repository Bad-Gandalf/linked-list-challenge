package com.patdoc;

public class Tomato {

    private boolean required;

    public Tomato(boolean required) {
        this.required = required;
    }

    public double getPRICE() {
        if (required){
            return 0.20d;
        }else {
            return 0.00d;
        }
    }

    public boolean isRequired() {
        return required;
    }
}
