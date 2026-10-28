package Basic_Java_Problems;

public class Patterns_Printing {
    // Right Pattern.
//            *
//            * *
//            * * *
//            * * * *
//            * * * * *

    // Inverted Triangle

//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
    public static void main(String[] args) {
//        int rows = 5;
//        for (int i = 1; i <= rows; i++){
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Print this pattern
         // 1 2 3 4 5
         // 1 2 3 4
         // 1 2 3
         // 1 2
         // 1


//        int rows = 5;
//        for (int i = rows; i >= 1; i--){
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Print this pattern

//            *
//           ***
//          *****
//         *******
//        *********

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1){
                    System.out.print("*");
                }else{
                    System.out.print("**");
                }
            }
            System.out.println();
            // IT works!
        }


    }
}
