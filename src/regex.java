import java.util.regex.*;
class regex {
    public static void main(String[] args) {
    }
        {
            System.out.println("metacharacters d...");
            System.out.println(Pattern.matches("\\d","abc"));
            System.out.println(Pattern.matches("\\d","5"));
            System.out.println(Pattern.matches("\\d","4443"));
            System.out.println(Pattern.matches("\\d","323abc"));
            System.out.println("metacharacters D...");
            System.out.println(Pattern.matches("\\D","abc"));
            System.out.println(Pattern.matches("\\D","1"));
            System.out.println(Pattern.matches("\\D","4443"));
            System.out.println(Pattern.matches("\\D","323abc"));
            System.out.println(Pattern.matches("\\D","m"));
            System.out.println("metacharacters D with quantifiers...");
            System.out.println(Pattern.matches("\\D","mask"));
        }

}
