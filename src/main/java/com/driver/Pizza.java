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
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!this.isExtraCheeseAdded) {
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!this.isExtraToppingsAdded) {
            this.isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!this.isPperBagAdded) {
            this.isPperBagAdded = true;
        }
    }

    public String getBill(){
        if(!this.isBillGenerated) {
            int totalPrice = 0;
            this.bill += "Base Price Of The Pizza: "+this.price+"\n";
            totalPrice += this.price;

            if(this.isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: "+this.extraCheesePrice+"\n";
                totalPrice += this.extraCheesePrice;
            }
            if(this.isExtraToppingsAdded) {
                this.bill += "Extra Toppings Added: "+this.extraToppingsPrice+"\n";
                totalPrice += this.extraToppingsPrice;
            }
            if( this.isPperBagAdded) {
                this.bill += "Paperbag Added: "+this.paperBagPrice+"\n";
                totalPrice += this.paperBagPrice;
            }
            this.bill += "Total Price: "+totalPrice+"\n";
            this.isBillGenerated = true;
            return this.bill;
        }
        return "";
    }
}
