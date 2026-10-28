package Basic_Java_Problems;

public class Basic_Class {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Thar");
        Car c3 = new Car("BNW", 250);
        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
    }
}

class Car{

    String brand;
    int speed;

    Car (){ // 1.  Default Constructor.
        this.brand = "Nano";
        this.speed = 80;
    }

    Car (String brand){   // 2. Parameterized constructor (One detail)
        this.brand = brand;
        this.speed = 90;
    }

    Car (String brand, int speed){  // 3. Parameterized constructor (Full detail)
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo(){
        System.out.println("Your Car company name is " + brand + " and speed is " + speed);
    }

}
