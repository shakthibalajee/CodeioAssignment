package Week4.Polymorphism;

abstract class Employee{
    abstract void getBonus();
}

class Developer extends Employee{
    @Override
    void getBonus(){
        System.out.println("Developer Bonus: Rs.2500");
    }
}

class Manager extends Employee{
    @Override
    void getBonus(){
        System.out.println("Manager Bonus: Rs.5000");
    }
}

public class EmpBonus {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Developer developer = new Developer();
        manager.getBonus();
        developer.getBonus();
    }
}
