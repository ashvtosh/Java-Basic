import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        /*int i = 100;
        while (i<=200){
            System.out.println(i);
            i++;
        }*/

        /*int a = 0;
        do{
            System.out.println(a);
            a++;
        }while(a<5);*/

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=0;i<a;i++) {
            System.out.println(2 * i + 1);
        }

//        for (int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("ending of the loop");
//                break;
//            }
//        }


      /*int i=0;
      while(i<5) {
          System.out.println(i);
          System.out.println("java is great");
          if (i == 2) {
              System.out.println("ending of the loop");
              break;
          }
          i++;
      }
        System.out.println("loops ends here");*/
    }
}
