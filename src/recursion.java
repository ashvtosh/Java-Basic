/*public class recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1){
            return 1;
    }
    else{
            return n* factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int x= 4;
        System.out.println(factorial(x));
    }
}*/
public class recursion {
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        int result = fib(10);
        System.out.println(result);
    }
}

