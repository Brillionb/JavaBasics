public class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String getInfo(int i) {
        return "У " + position + "a по имени " + name + " зарплата за " + i + " месяцев равна " + salary * i;
    }

}
