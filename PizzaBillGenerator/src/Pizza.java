class Pizza{
    public int price;
    public boolean veg;
    public int extraCheese = 100;
    public int extraToppings = 150;
    public int bagPackPrice = 20;

    public boolean isExtraCheeseAdded = false;
    public boolean isExtraToppingsAdded = false;
    public boolean isOptedForTakeAway = false;
    public int basePizzaPrice;

    public Pizza(boolean veg){
        this.veg = veg;
        if (this.veg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        basePizzaPrice += this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheese;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppings;
    }

    public void getAway(){
        isOptedForTakeAway = true;
        this.price += bagPackPrice;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Bill: "+basePizzaPrice);
        if (isExtraCheeseAdded){
            bill += "Extra Cheese Added: "+extraCheese+ "\n";
        }
        if (isExtraToppingsAdded){
            bill += "Extra Toppings Added: " + extraToppings+ "\n";
        }
        if (isOptedForTakeAway){
            bill += "Take Away: " + bagPackPrice+ "\n";
        }
        bill += "Total Bill: " + this.price;
        System.out.println(bill);
    }
}
