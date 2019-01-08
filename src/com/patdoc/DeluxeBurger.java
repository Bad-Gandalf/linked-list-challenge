package com.patdoc;

public class DeluxeBurger extends Hamburger{

    private Drink drink = new Drink(true);
    private Chips chips = new Chips(true);

    public DeluxeBurger(String rollType, String meat, double basePrice) {
        super(rollType, meat, basePrice);
    }



    @Override
    public double getTotal() {
        double total = (getBasePrice() + getCheese().getPRICE() + getOnion().getPRICE()
                + getLettuce().getPRICE() + getTomato().getPRICE() + chips.getPRICE()
                + drink.getPRICE());
        return total;
    }

    @Override
    public void describeBurger() {
        System.out.println("Your Deluxe Burger consists of a " + getRollType() + ", "
                + getMeat() + " : £" + getBasePrice());
        if (getLettuce().isRequired()){
            System.out.println("Lettuce : £" + getLettuce().getPRICE());
        }
        if (getOnion().isRequired()){
            System.out.println("Onion : £" + getOnion().getPRICE());
        }
        if (getCheese().isRequired()){
            System.out.println("Cheese : £" + getCheese().getPRICE());
        }
        if (getTomato().isRequired()){
            System.out.println("Tomato : £" + getTomato().getPRICE());
        }
        System.out.println("Chips : £" + chips.getPRICE());
        System.out.println("Drink : £" + drink.getPRICE());
        System.out.println("Total price comes to £" + getTotal() + ".");
    }
}
