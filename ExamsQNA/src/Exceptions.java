class Try{
    static void AgeCheck(int age){
        if (age < 18){
            throw new ArithmeticException("Not Eligible");
        }
        else{
            System.out.println("Eligible");
        }
    }
}


public class Exceptions {
    public static void main(String[] args) {
       try{
           Try.AgeCheck(19);
       }
       catch(ArithmeticException e){
           System.out.println("Exception Caught:" + e.getMessage());
       }
       finally {
           System.out.println("Check Complete");
       }
    }
}
