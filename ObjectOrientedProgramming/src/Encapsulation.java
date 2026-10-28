public class Encapsulation {
    public static void main(String[] args){

       Laptop l1 = new Laptop();
       l1.ram = 512;
       l1.setPrice(400_00);
    }
    protected void dowork(){
        System.out.println("Doing Work");
    }
}

class Laptop{
    int ram;
    private int price;

    public void setPrice(int price){
        // If the user is an admin, he/she can change the price
        boolean isAdmin = true;
        if(!isAdmin){
            System.out.println("You cannot set the price");
        }
        else {
            this.price = price;
            System.out.println("The price is: " + price);
        }
    }
}

