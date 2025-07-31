class Employee {
    String name;
    int ID;
    int salary;

    public Employee() {
        name = "suraj";     
        ID = 143;
        salary = 50000;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + ID);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}