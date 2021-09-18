/*public class method2 {
    static void telljoke(){
        System.out.println("fuck off\n" +
                "HOLA");
    }
    public static void main(String[] args) {
        telljoke();
    }
}*/

/*public class method2 {
    static void change(int a){
        a=98;
    }
    public static void main(String[] args) {
        int [] marks = {52,73,77,89,98,94};
        int x = 45;
        change(x);
        System.out.println(x);
    }
}*/

/*public class method2 {
    static void change2(int [] arr){
        arr[0] =98;
    }
    public static void main(String[] args) {
        int [] marks = {52,73,77,89,98,94};
        change2(marks);
        System.out.println(marks[0]);
    }
}*/

public class method2 {
    static void foo(){
        System.out.println("good morning bro!");
    }
    static void foo(int a){
        System.out.println("good morning" + a + "bro!");
    }
    static void foo(int a, int b){
        System.out.println("good morning" + a + "bro!");
        System.out.println("good morning" + b + "bro!");
    }
    public static void main(String[] args) {
        foo();
        foo(3000);
        foo(3000, 500);
    }
}
