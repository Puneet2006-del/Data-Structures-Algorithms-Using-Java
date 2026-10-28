public class ListOverlap {
    // Write a Java program that return's the common numbers between two lists.
    public static void main(String[] args){
        int[] l1 = {1,2,3,4};
        int[] l2 = {3,4,5,6};

        for (int i = 0; i < l1.length; i++){
            for (int j = 0; j < l2.length; j++){
                if (l1[i] == l2[j])
                    System.out.println("Common Numbers: " + l1[i]);
            }
        }
    }
}