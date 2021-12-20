import java.util.Scanner;
public class ash2 {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of subject 1");
        float a = sc.nextFloat();
        System.out.println("enter marks of subject 2");
        float b = sc.nextFloat();
        System.out.println("enter marks of subject 3");
        float c = sc.nextFloat();
        float percentage = ((a + b + c)/ 3);
        if(percentage>=40 && a>=33 && b>=33 && c>=33){
            System.out.println("you have been pass");
        }
        else{
            System.out.println("you have been fail");
        }
        System.out.println(percentage);
    }
}
