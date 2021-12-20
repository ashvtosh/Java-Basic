class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("ashutosh");
    }
}
class B extends A{
    public void meth2(){
        System.out.println("bye");
    }
    public void meth3(){
        System.out.println("hello");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
    }
}