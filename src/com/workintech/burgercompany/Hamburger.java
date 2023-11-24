package com.workintech.burgercompany;

public abstract class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;


    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAddition1Name(String addition1Name, double additon1Price) {
        if (addition1Name != null) {
            if (addition1Name.equals("domates") ||
                    addition1Name.equals("turşu") || addition1Name.equals("chedar") ||
                    addition1Name.equals("marul")) {
                this.addition1Name = addition1Name;
            }
            if (additon1Price > 0) {
                this.addition1Price = additon1Price;
            } else {
                System.out.println("girilen fiyat geçerli değil");
            }
        } else {
            System.out.println("ilk eklenen ürün geçerli değil.");
        }
    }

    public void setAddition2Name(String addition2Name, double additon2Price) {
        if (addition2Name != null) {
            if (addition2Name.equals("domates") || addition2Name.equals("turşu") ||
                    addition2Name.equals("chedar") || addition2Name.equals("marul")) {
                this.addition2Name = addition2Name;
            }
            if (additon2Price > 0) {
                this.addition2Price = additon2Price;
            } else {
                System.out.println("girilen fiyat geçerli değil");
            }
        } else {
            System.out.println("ilk eklenen ürün geçerli değil.");
        }
    }

    public void setAddition3Name(String addition3Name, double additon3Price) {
        if (addition3Name != null) {
            if (addition3Name.equals("domates") || addition3Name.equals("marul") ||
                    addition3Name.equals("chedar") || addition3Name.equals("turşu")) {
                this.addition3Name = addition3Name;
            }
            if (additon3Price > 0) {
                this.addition3Price = additon3Price;
            } else {
                System.out.println("girilen fiyat geçerli değil");
            }
        } else {
            System.out.println("ilk eklenen ürün geçerli değil.");
        }
    }

    public void setAddition4Name(String addition4Name, double additon4Price) {
        if (addition4Name != null) {
            if (addition4Name.equals("domates") || addition4Name.equals("turşu") ||
                    addition4Name.equals("chedar") || addition4Name.equals("marul")) {
                this.addition4Name = addition4Name;
            }
            if (additon4Price > 0) {
                this.addition4Price = additon4Price;
            } else {
                System.out.println("girilen fiyat geçerli değil");
            }
        } else {
            System.out.println("ilk eklenen ürün geçerli değil.");
        }
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public String totalHamburger() {

        String additionalIngredients = getClass().getSimpleName() + " için eklenen Malzemeler: " +
                (addition1Name != null ? addition1Name + "( +" + String.valueOf(addition1Price) + "tl ) " : "") +
                (addition2Name != null ? addition2Name + "( +" + String.valueOf(addition2Price) + "tl ) " : "") +
                (addition3Name != null ? addition3Name + "( +" + String.valueOf(addition3Price) + "tl ) " : "") +
                (addition4Name != null ? addition4Name + "( +" + String.valueOf(addition4Price) + "tl ) " : "");
        String hamburger = getName() + ", " + getMeat() + ", " + getBreadRollType()+"( "+ String.valueOf(getPrice())+"tl )";

        double additionPriceTotal = addition1Price + addition2Price + addition3Price + addition4Price + getPrice();

        return hamburger + " \n" + additionalIngredients + "\nToplam ödenecek tutar: " + String.valueOf(additionPriceTotal);

    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", breadRollType='" + breadRollType + '\'' +
                ", price=" + price +
                ", addition1Name='" + addition1Name + '\'' +
                ", addition2Name='" + addition2Name + '\'' +
                ", addition3Name='" + addition3Name + '\'' +
                ", addition4Name='" + addition4Name + '\'' +
                ", addition1Price=" + addition1Price +
                ", addition2Price=" + addition2Price +
                ", addition3Price=" + addition3Price +
                ", addition4Price=" + addition4Price +
                '}';
    }
}
