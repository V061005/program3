public class Employee {
    String name;
    int id;
    double salary;
    String phone;  

    public Employee(String name, int id, double salary, String phone) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.phone = phone;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Phone Number: " + phone);  
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Vaishnavi", 101, 50000.0, "9148360846");  // Phone number as a string
        emp1.displayInfo();
    }
}
