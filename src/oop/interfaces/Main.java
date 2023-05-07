package oop.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee cook1 = new Cook("John");
        Employee cook2 = new Cook("Douglas");
        Employee cook3 = new Cook("Nick");

        Employee programmer1 = new Programmer("Ivan");
        Employee programmer2 = new Programmer("Vladimir");
        Employee programmer3 = new Programmer("Kirill");

        Employee driver1 = new Driver("Petr");
        Employee driver2 = new Driver("Oleg");
        Employee driver3 = new Driver("Sergey");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(cook1);
        employees.add(cook2);
        employees.add(cook3);
        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);

        for (Employee employee : employees){
            employee.voice();
        }
        for (Employee employee: employees){
            if (employee instanceof Cook){
                ((Cook) employee).cook();
            }
        }
        for (Employee employee : employees){
            if (employee instanceof Programmer){
                ((Programmer) employee).code();
            }
        }
        for (Employee employee : employees){
            if (employee instanceof Driver){
                ((Driver) employee).drive();
            }
        }
    }
}
