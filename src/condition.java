import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        /*char var = 'c';
        switch(var){
            case 'r':
                System.out.println("hello");
                break;
            case 'c':
                System.out.println("good");
                break;
            default:
                System.out.println("bye");
        }
        System.out.println("nope");*/



        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age of boy");
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("hello");
                break;
            case 24:
                System.out.println("good");
                break;
            default:
                System.out.println("bye");
        }
        System.out.println("nope");



        /*if(a==18){
            System.out.println("yes boy you can drive");
        }
        else {
            System.out.println("no boy you can't drive");
        }*/
    }
}
