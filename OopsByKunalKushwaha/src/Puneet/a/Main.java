package Puneet.a;

public class Main {
    public static void main(String[] args){
        Human puneet = new Human(21,"Puneet",10000,false);
        Human rahul = new Human(25,"Rahul",15000,false);
        Human anil  = new Human(30,"Anil",20000,true);

        System.out.println(Human.population);
        System.out.println(puneet.salary);
    }
}

class ExceptionOfABc extends Exception{

}
