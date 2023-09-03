package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isPperBagAdded = false;
    private boolean isBillGenerated = false;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int paperBagPrice;
    private int basePrice;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg) {
            this.basePrice = 300;
            this.extraToppingsPrice = 70;
        } else {
            this.basePrice = 400;
            this.extraToppingsPrice = 120;
        }
        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;
        this.bill = "";
        this.price = this.basePrice;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!this.isExtraCheeseAdded) {
            this.isExtraCheeseAdded = true;
            this.price += this.extraCheesePrice;
        }
    }

    public void addExtraToppings(){
        if(!this.isExtraToppingsAdded) {
            this.isExtraToppingsAdded = true;
            this.price += this.extraToppingsPrice;
        }
    }

    public void addTakeaway(){
        if(!this.isPperBagAdded) {
            this.isPperBagAdded = true;
            this.price += this.paperBagPrice;
        }
    }

    public String getBill(){
        if(!this.isBillGenerated) {
            this.bill += "Base Price Of The Pizza: "+this.basePrice+"\n";

            if(this.isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: "+this.extraCheesePrice+"\n";
            }
            if(this.isExtraToppingsAdded) {
                this.bill += "Extra Toppings Added: "+this.extraToppingsPrice+"\n";
            }
            if(this.isPperBagAdded) {
                this.bill += "Paperbag Added: "+this.paperBagPrice+"\n";
            }
            this.bill += "Total Price: "+this.price+"\n";
            this.isBillGenerated = true;
        }
        return this.bill;
    }
}
