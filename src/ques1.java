import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
//        int n = 4;
//        for(int i=n;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


        int sum=0;
        int n=2;
        for(int i=0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.println(sum);


//        int n=5;
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }

          /*System.out.println("taking input from the user");
          Scanner sc = new Scanner(System.in);
          System.out.println("enter number");
          int n =sc.nextInt();
          int i = 1;
          int factorial = 1;
          while(i<=n){
              factorial *=i;
              i++;
          }
          System.out.println(factorial);*/


        /*int n =8;
        int sum = 8;
        for(int i=0;i<=10;i++){
            sum += n*i;
        }
        System.out.println(sum);*/


    }
}
