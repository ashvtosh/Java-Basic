class base1{
    base1(){
        System.out.println("hello");
    }
    base1(int x){
        System.out.println("boi" + x);
    }
}
class derived1 extends base1{
    derived1(){
//        super(0);
        System.out.println("fuck");
    }
    derived1(int x,int y){
        super(x);
        System.out.println("bye" + 6);
    }
}
class childofderive extends derived1{
    childofderive(){
        System.out.println("ashutosh");
    }
    childofderive(int x, int y, int z){
        super(x,y);
        System.out.println("singh");
    }
}
public class constructorininheritance {
    public static void main(String[] args) {
//        base1 b = new base1();
//        derived1 d = new derived1();
//        derived1 d = new derived1(4,9);
        childofderive cd = new childofderive();
    }
}
