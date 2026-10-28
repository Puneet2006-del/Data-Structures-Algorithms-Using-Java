import java.util.ArrayList;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Puneet");
        list.add("Ram");
        list.add("Abdul");
        System.out.println(list);
    }


}

