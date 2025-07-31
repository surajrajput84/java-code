class Employee2 {
     String name;
     int ID;
    int salary;
    String dept;

    public Employee2() {
        name = "suraj";
        ID = 34;
        salary = 199009;
System.out.println("1st student");
 System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + ID);
        System.out.println("Employee Salary: " + salary);
	
    }
    public Employee2(String name, int ID,String dept) {
        name = name;
        ID = ID;
        dept=dept;
System.out.println("2nd student");
 System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + ID);
        System.out.println("Employee department:" + dept);
	
    }
    public Employee2( int ID,String dept) {
     
        ID = ID;
        dept=dept;
System.out.println("3rd student");

        System.out.println("Employee ID: " + ID);
        System.out.println("Employee department:" + dept);



    }
   public static void main(String[] args) {
	Employee2 e = new Employee2();
        Employee2 e1 = new Employee2("akash", 143, "IT");
	Employee2 e2 = new Employee2(145, "CSE");
       
    }
}