package Day6;

class Employee {
    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double calculateSalary() {
        return 25000;
    }
}

class PartTimeSalary extends Employee {
    double calculateSalary() {
        return 20000;
    }
}

public class AdvancePolymorphism {
    public static void main(String[] args) {
        Employee emp, fullTimeEmp, partTimeEmp;

        emp = new Employee();
        fullTimeEmp = new FullTimeEmployee();
        partTimeEmp = new PartTimeSalary();

        System.out.println("Employee " + emp.calculateSalary());
        System.out.println("Full Time Employee " + fullTimeEmp.calculateSalary());
        System.out.println("Part Time Employee" + partTimeEmp.calculateSalary());
    }
}
