class Employee1 {
     String name;
     int ID;
    int salary;

    public Employee1(String name, int ID, int salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }


    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + ID);
        System.out.println("Employee Salary: " + salary);
    }
   public static void main(String[] args) {
        Employee1 e = new Employee1("Suraj", 143, 50000);
        e.display();
    }
}