public class Arrays {
    public static void main(String[] args){
//        int[] numbers = new int[5];
//        numbers[0] = 15;
//        numbers[1] = 20;
//        numbers[2] = 25;
//        numbers[3] = 30;
//        numbers[4] = 40;
//      arrays are the fixed length
//        System.out.println(java.util.Arrays.toString(numbers));

        // Efficient way to write this code
        int[] numbers = {10,30,15,20,45,25,35};
        System.out.println(numbers.length);
        java.util.Arrays.sort(numbers);
        System.out.println(java.util.Arrays.toString(numbers));

        // Multi-dimensional Arrays

//        int [][] number = new int[2][3];
//        number[0][0] = 1;
//        System.out.println(java.util.Arrays.deepToString(number));

        // Another Way to do this
        int [][] number = {{1,2,3}, {4,5,6}};
        System.out.println(java.util.Arrays.deepToString(number));

        // Constants = Value cannot be changed by using final keyword

        final float PI = 3.14F;
        System.out.println(PI);
    }
}
