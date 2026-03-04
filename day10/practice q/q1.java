// question 1
/* 1.create class employee 
2. salary property(int)
3. getSalary (method returning int)
4. name property(string)
5. getname(method returning string)
6. getname(method changing name)
 */
class employee_Q1 {

    int Salary;
    String Name;

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String n) {
        Name = n;
    }
}

public class q1 {
    public static void main(String[] args) {
        employee_Q1 abhi = new employee_Q1();
        abhi.setName("Abhishek");
        abhi.Salary = 500;
        System.out.println(abhi.getSalary());
        System.out.println(abhi.getName());
        System.out.println("Employee details example practice question ");
    }
}
