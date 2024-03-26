class Employee {
    int empNo;
    String empName;
    String department;
    double basic;
    double hra;
    double it;
    private final double DA;

    public Employee(int empNo, String emp String department, double basic, double hra, double it){
        this.empNo = empNo;
        this.empName = empName;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
        this.DA = 20000;
    }

    public double calculateSalary() {
        return basic + hra + DA - it;
    }
}

public class Exp1 {
    public static void main(String[] args) {
        Employee e = new Employee(10628, "Sanjay", "CSE", 150000, 10000, 5000);
        System.out.println("Emp No.\tEmp Name\tDesignation\tSalary");
        System.out.println(e.empNo + "\t" + e.empName + "\tEngineer\t" + e.calculateSalary());
    }
}
