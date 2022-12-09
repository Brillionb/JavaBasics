public class EmployeeMain {
    public static void main(String[] args) {
        Employee vladimir = new Employee("Владимир", "программист", 60_000);
        System.out.println(vladimir.getInfo(10));
    }
}
