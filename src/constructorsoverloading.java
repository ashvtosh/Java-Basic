class hello{
    private int id;
    private String name;
    public hello(){
        id = 0;
        name = "ashutosh";
    }
    public hello(String myname, int myId){
        id = myId;
        name = myname;
    }
    public hello(int myId){
        id = myId;
        name = "ashu";
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
public class constructorsoverloading {
    public static void main(String[] args) {
        hello harry = new hello(23000);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}

