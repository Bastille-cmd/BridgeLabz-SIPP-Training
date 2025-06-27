public class EmployeeDetails {
    String name;
    int id;
    double salary;

    EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        EmployeeDetails e = new EmployeeDetails("John", 101, 50000);
        e.displayDetails();
    }
}