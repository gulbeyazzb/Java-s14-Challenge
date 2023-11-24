package com.workintech.burgercompany;

public class DeluxeBurger extends Hamburger{
    private String drink;
    private boolean cips;
    public DeluxeBurger(String name, String meat, String breadRollType, String drink, boolean cips,double price) {
        super(name, meat, breadRollType,price);
        super.setPrice(19.5);
    }

    @Override
    public void setAddition1Name(String addition1Name, double additon1Price) {
        System.out.println(getClass().getSimpleName()+" için ek malzeme ekleyemezsiniz...");
    }

    @Override
    public void setAddition2Name(String addition2Name, double additon2Price) {
        System.out.println(getClass().getSimpleName()+" için ek malzeme ekleyemezsiniz...");

    }

    @Override
    public void setAddition3Name(String addition3Name, double additon3Price) {
        System.out.println(getClass().getSimpleName()+" için ek malzeme ekleyemezsiniz...");

    }

    @Override
    public void setAddition4Name(String addition4Name, double additon4Price) {
        System.out.println(getClass().getSimpleName()+" için ek malzeme ekleyemezsiniz...");

    }
}
