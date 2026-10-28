package Recursion;

public class Message_Program {
    public static void main(String[] args) {
        printMsg();
    }
    static void printMsg(){
        // Print Hello Word 5 Times.
        System.out.println("Hello Word");
        printMsg1();

    }
    static void printMsg1(){
        System.out.println("Hello Word");
        printMsg2();
    }
    static void printMsg2(){
        System.out.println("Hello Word");
        printMsg3();
    }
    static void printMsg3(){
        System.out.println("Hello Word");
        printMsg4();
    }
    static void printMsg4(){
        System.out.println("Hello Word");
    }

}
