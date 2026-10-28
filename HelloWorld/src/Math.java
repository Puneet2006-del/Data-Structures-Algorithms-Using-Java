public class Math {
    public static void main(String[] args){
//        int result = java.lang.Math.round(1.1F); // Round of the data to nearest integer
//        int result = (int)java.lang.Math.ceil(1.1F); // Round of the data to the highest value integer
        int result = (int)java.lang.Math.floor(1.1F); // Round of the data to the lowest value integer
        int r = (int)java.lang.Math.max(5,6); // Return's maximum value and same is min return's minimum value
//        double random = java.lang.Math.random(); // Return's random value between 0 and 1
        int random = (int)java.lang.Math.round(java.lang.Math.random() * 100); // Random value between 0 and 100
        System.out.println(random);


    }
}
