public class Reference {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.brand = "Hyundai";
        c1.speed = 120;
        c1.mileage = 12;
        c1.drive();

        c2.brand = "TATA";
        c2.speed = 100;
        c2.mileage = 14;
        c2.drive();
    }
}

class Car{
    String brand;
    int speed;
    int mileage;

    void drive(){
        System.out.println(brand + " is driving at " + speed + " km/h and has a mileage of " + mileage + " km per liter");
    }
}
