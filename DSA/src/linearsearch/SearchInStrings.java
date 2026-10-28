package linearsearch;

public class SearchInStrings {
    public static void main(String[] args) {
        // Find the Character in this String
        String name = "Puneet";
        char target = 'i';
        System.out.println(search(name,target));
    }
    static boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for (char i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
