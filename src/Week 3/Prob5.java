import java.util.*;
class Employees{
    private String name;
    private String id;
    private int salary;

    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    String getId(){
        return id;
    }

    void setId(String id){
        this.id=id;
    }

    int getSalary(){
        return salary;
    }

    void setSalary(int salary){
        this.salary=salary;
    }

    void details(){
        Scanner sc =new Scanner(System.in);
        String names=sc.nextLine();
        String ids=sc.nextLine();
        int salaries=sc.nextInt();
        setName(names);
        setId(ids);
        setSalary(salaries);
        System.out.println("------Employee Details------");
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getId());
        System.out.println("Employee Salary: " + getSalary());
        System.out.println("------Details of Employee is Stored in Database Successfully!------");
    }

}
public class Prob5{
    public static void main(String[] args){
        Employees e1 = new Employees();
        e1.details();
    }
}