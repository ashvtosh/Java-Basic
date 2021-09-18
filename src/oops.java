class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is" + id);
        System.out.println("and my name is" + name);
    }
    public int getSalary(){
        return salary;
    }
}
public class oops {
    public static void main(String[] args) {
        System.out.println("this is our first class");
        Employee harry = new Employee();
        Employee john = new Employee();
        harry.id = 12;
        harry.salary = 12;
        harry.name = "Codewith harry";
        john.id = 17;
        john.name = "John Khandelwal";
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}
