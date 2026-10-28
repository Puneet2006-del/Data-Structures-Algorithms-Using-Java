package String_StirngBuilder;

public class SB {
    // SB = String Builder.
//    In Java, the StringBuilder class is a part of the java.lang package and represents a mutable sequence of characters.
//    Unlike the String class (which is immutable — once created, it cannot be changed), a StringBuilder object can be modified
//    in place without creating new objects for every change. This makes it faster and more memory-efficient for scenarios
//    involving frequent string modifications such as appending, inserting, deleting, or replacing characters.
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
    }

}
