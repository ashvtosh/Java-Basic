import java.util.Scanner;

public class ques4 {
    static void logic(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }
    public static void main(String[] args) {
        logic(7);
    }
}


/*public class ques4 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}*/

/*public class ques4 {
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    public static void main(String[] args) {
        int c = sumRec(3);
        System.out.println(c);
    }
}*/

/*public class ques4 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}*/

// using recursion
/*public class ques4 {
    static void pattern(int n){
        if(n>0){
            pattern(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}*/