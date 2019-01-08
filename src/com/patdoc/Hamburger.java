package com.patdoc;

public class Hamburger {
    private Lettuce lettuce = new Lettuce(false);
    private Tomato tomato = new Tomato(false);
    private Onion onion = new Onion(false);
    private Cheese cheese = new Cheese(false);
    private String rollType;
    private double basePrice;
    private String meat;


    public Hamburger(String rollType, String meat, double basePrice) {
        this.rollType = rollType;
        this.basePrice = basePrice;
        this.meat = meat;
    }

    public String addCheese(){
        if (getCheese().isRequired()){
            return "No more cheese can be added";

        }else{
            cheese = new Cheese(true);

        }
        return "You have added cheese to your burger. The new price is £"
                + getTotal();

    }

    public String addTomato(){
        if (getTomato().isRequired()){
            return "No more tomato can be added";

        }else{
            tomato = new Tomato(true);

        }
        return "You have added tomato to your burger. The new price is £"
                + getTotal();
    }

    public String addLettuce(){
        if (getLettuce().isRequired()){
            return "No more lettuce can be added";

        }else{
            lettuce = new Lettuce(true);

        }
        return "You have added lettuce to your burger. The new price is £"
                + getTotal();
    }

    public String addOnion(){
        if (getOnion().isRequired()){
            return "No more onion can be added";


        }else{
            onion = new Onion(true);
        }
        return "You have added onion to your burger. The new price is £"
                + getTotal();
    }

    public void describeBurger(){
        System.out.println("Your burger consists of a " + getRollType() + ", "
                + getMeat() + " : £" + getBasePrice());
        if (getLettuce().isRequired()){
            System.out.println("Lettuce : " + getLettuce().getPRICE());
        }
        if (getOnion().isRequired()){
            System.out.println("Onion : " + getOnion().getPRICE());
        }
        if (getCheese().isRequired()){
            System.out.println("Cheese : " + getCheese().getPRICE());
        }
        if (getTomato().isRequired()){
            System.out.println("Tomato : " + getTomato().getPRICE());
        }

        System.out.println("Total price comes to £" + getTotal() + ".");
    }
    public double getTotal() {
        double total = (getBasePrice() + getCheese().getPRICE() + getOnion().getPRICE()
                + getLettuce().getPRICE() + getTomato().getPRICE());
        return total;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Lettuce getLettuce() {
        return lettuce;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public Onion getOnion() {
        return onion;
    }

    public Cheese getCheese() {
        return cheese;
    }
}

