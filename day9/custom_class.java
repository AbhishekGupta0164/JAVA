
class Employee { // here we pass fixed arguments
    int id;
    String name;
    int salary = 999;

    public void printdetails() {
        System.out.println("My id is: " + id);
        System.out.println("and My name is:  " + name);
        System.out.println("My salary is: " + salary);
    }

    public int get_salary() {
        return salary;
    }

}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        Employee abhi = new Employee(); // instantiating a new Employee object
        Employee john = new Employee();

        // seting attributes for abhi
        abhi.id = 07;
        abhi.name = "abhira";
        abhi.salary = 50000;

        // seting attributes for john
        john.id = 32;
        john.name = "john rana";
        john.salary = 4000;

        // printing the attributes
        abhi.printdetails();
        abhi.get_salary();
        // int salary = abhi.get_salary();
        // System.out.println(salary);

        john.printdetails();
        john.get_salary();
        // int salary = john.get_salary();
        // System.out.println(salary);

        // System.out.println(abhi.id);
        // System.out.println(abhi.name);
    }
}
