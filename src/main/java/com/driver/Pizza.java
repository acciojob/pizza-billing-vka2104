package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int totalPrice = 0;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isPperBagAdded = false;
    private boolean isBillGenerated = false;
    private final int extraCheesePrice;
    private final int extraToppingsPrice;
    private final int paperBagPrice;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg) {
            this.price = 300;
            this.extraToppingsPrice = 70;
        } else {
            this.extraToppingsPrice = 120;
            this.price = 400;
        }
        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;
        this.bill = "";
        this.totalPrice += this.price;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!this.isExtraCheeseAdded) {
            this.isExtraCheeseAdded = true;
            this.totalPrice += extraCheesePrice;
        }
    }

    public void addExtraToppings(){
        if(!this.isExtraToppingsAdded) {
            this.isExtraToppingsAdded = true;
            this.totalPrice += extraToppingsPrice;
        }
    }

    public void addTakeaway(){
        if(!this.isPperBagAdded) {
            this.isPperBagAdded = true;
            this.totalPrice += paperBagPrice;
        }
    }

    public String getBill(){
        if(!this.isBillGenerated) {
            this.bill += "Base Price Of The Pizza: "+this.price+"\n";

            if(this.isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: "+this.extraCheesePrice+"\n";
            }
            if(this.isExtraToppingsAdded) {
                this.bill += "Extra Toppings Added: "+this.extraToppingsPrice+"\n";
            }
            if(this.isPperBagAdded) {
                this.bill += "Paperbag Added: "+this.paperBagPrice+"\n";
            }
            this.bill += "Total Price: "+this.totalPrice+"\n";
            this.isBillGenerated = true;
        }
        return this.bill;
    }
}
