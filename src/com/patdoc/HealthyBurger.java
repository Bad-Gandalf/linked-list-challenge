package com.patdoc;

public class HealthyBurger extends Hamburger {

    private Carrot carrot = new Carrot(false);
    private BellPepper bellPepper = new BellPepper(false);


    public HealthyBurger(String meat, double basePrice) {
        super("Brown Rye Bread Roll", meat, basePrice);


    }

    private String addCarrot(){

            if (getCarrot().isRequired()){
                return "No more carrot can be added";

            }else{
                carrot = new Carrot(true);
            }
            return "You have added carrot to your burger. The new price is £"
                    + getTotal();

    }

    private String addBellPepper(){

        if (getBellPepper().isRequired()){
            return "No more bell peppers can be added";

        }else{
            bellPepper = new BellPepper(true);

        }
        return "You have added bell peppers to your burger. The new price is £"
                + getTotal();

    }

    private Carrot getCarrot() {
        return carrot;
    }

    private BellPepper getBellPepper() {
        return bellPepper;
    }

    @Override
    public void describeBurger() {
        System.out.println("Your Healthy Burger consists of a " + getRollType() + ", "
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
        if (getCarrot().isRequired()){
            System.out.println("Carrot : £" + getCarrot().getPRICE());
        }
        if (getBellPepper().isRequired()){
            System.out.println("Bell Pepper : £" + getBellPepper().getPRICE());
        }


        System.out.println("Total price comes to £" + getTotal() + ".");

    }

    @Override
    public double getTotal() {

        double total = (getBasePrice()+ getCheese().getPRICE() + getOnion().getPRICE()
                + getLettuce().getPRICE() + getTomato().getPRICE() + getBellPepper().getPRICE());
        return total;

    }




}
