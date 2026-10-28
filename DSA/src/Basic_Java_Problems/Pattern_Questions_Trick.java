package Basic_Java_Problems;

public class Pattern_Questions_Trick {
    // 1. Run the outer for loop the number of times you are having the lines.
    // Outer for loop for rows and inner for loop for columns.
    // 2. Identify for every row number, how many columns are there.
    // Or types of elements in the columns.
    // 3. Provide what do you need to print.

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
        pattern6(5);
    }


    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            // For every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need to print newline
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            // For every row run the column
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            // For every row run the column
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            // For every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row <= 2 * n - 1; row++) {
            // For every row run the column
            int totalColInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col < totalColInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int row = 0; row < 2 * n; row++) {
            // For every row run the column
            int totalColInRow = row > n ? 2 * n - row: row;
            int noOfSpaces = n - totalColInRow;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
