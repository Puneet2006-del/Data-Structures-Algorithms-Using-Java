public class Palindrome {
    // Write a java program that check the string whether it is Palindrome or not.
    public static void main(String[] args){
        String name = ("Wow");
        String nameInLowerCase = name.toLowerCase();
        StringBuilder sb = new StringBuilder(nameInLowerCase);
        String reversedName = sb.reverse().toString();
        if (nameInLowerCase.equals(reversedName)){
            System.out.println("This string is Palindrome");
        }
        else{
            System.out.println("This string is not Palindrome");
        }
    }
}
