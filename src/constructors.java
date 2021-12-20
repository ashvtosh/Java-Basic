class MyMainEmployee{
    private int id;
    private String name;
//    public MyMainEmployee(){
//        id = 45;
//        name = "ashutosh";
//    }
    public MyMainEmployee(String myname, int myId){
        id = myId;
        name = myname;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId() {
        return id;
    }
}
public class constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("ashutosh", 34 );
//        harry.setname("ashutosh");
//        harry.setid(24);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}