package Day6;

class Employee{
    double calculateSalary(){
        return 0;
    }
}

class FullTimeEmployee extends Employee{
    double calculateSalary(){
        return 25000;
    }
}

class PartTimeSalary extends Employee{
    double calculateSalary(){
        return 20000;
    }
}

public class AdvancePolymorphism {
    public static void main(String[] args){
        Employee emp;

        emp = new FullTimeEmployee();

        System.out.println(emp.calculateSalary());
    }
}
