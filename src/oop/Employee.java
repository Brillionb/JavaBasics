package oop;

class EmployeeMain {
    public static void main(String[] args) {
        Employee vladimir = new Employee("Владимир", "программист", 60_000);
        System.out.println(vladimir.getInfo(10));
    }
}

public class Employee {
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo(int i) {
        return "У " + position + "a по имени " + name + " зарплата за " + i + " месяцев равна " + salary * i;
    }

}
