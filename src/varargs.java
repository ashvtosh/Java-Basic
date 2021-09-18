public class varargs {
    static int sum(int ...arr){
        int result = 0;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,23,4,5,6));
        System.out.println(sum(4,5,7,2,5));
        System.out.println(sum());
    }
}

/*public class varargs {
    static int sum(int ...arr){
        int result = 5;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum());
    }
}*/



