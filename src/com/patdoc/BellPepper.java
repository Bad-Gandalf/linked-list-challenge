package com.patdoc;

public class BellPepper {
    private boolean required;

    public BellPepper(boolean required) {
        this.required = required;
    }

    public double getPRICE() {
        if (required){
            return 0.25d;
        }else {
            return 0.00d;
        }
    }

    public boolean isRequired() {
        return required;
    }
}
