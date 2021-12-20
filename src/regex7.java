import java.util.regex.*;
class regex7 {
    public static void main(String args[]) {
        System.out.println("by character classes and quantifiers...");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
        System.out.println();
    }
}