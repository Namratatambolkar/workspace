class abc {
    int id;
    int salary;
    String name;

    public void printdetails() {
        System.out.println("my id id" + id);
        System.out.println("my name is" + name);
    }

    public int getsalary() {
        return salary;
    }
}

public class test {

    public static void main(String args[]) {
        System.out.println("This is a custom class");
        abc e1 = new abc();
        abc e2 = new abc();
        e1.id = 12;
        e1.salary = 20000;
        e1.name = "namu";
        e2.id = 22;
        e2.salary = 30000;
        e2.name = "nehu";
        e1.printdetails();
        e2.printdetails();
        int salary = e2.getsalary();
        System.out.println(salary);
    }
}
