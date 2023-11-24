package com.workintech.burgercompany;

public class HealthyBurger extends Hamburger{
   private String healthyExtra1Name;
   private double healthyExtra1Price;
   private String healthyExtra2Name;
   private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, String breadRollType, double price) {
        super(name, meat, breadRollType, price);
    }

    @Override
    public void setAddition1Name(String healthyExtra1Name, double healthyExtra1Price) {
        super.setAddition1Name(healthyExtra1Name, healthyExtra1Price);
    }

    @Override
    public void setAddition2Name(String healthyExtra2Name, double healthyExtra2Price) {
        super.setAddition2Name(healthyExtra2Name, healthyExtra2Price);
    }


}
