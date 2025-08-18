class Student {
    String name = "Suraj";

    public void display() {
        System.out.println("Student name : " + name);
    }
}

class Sem1 extends Student {
    double cgpi1 = 7.7;

    public void show() {
        System.out.println("CGPI Sem1 : " + cgpi1);
    }
}

class Sem2 extends Sem1 {
    double cgpi2 = 8.2;

    public void show() {
        System.out.println("CGPI Sem2 : " + cgpi2);
    }

    public static void main(String args[]) {
        Sem2 t = new Sem2();
        double cgpi = (t.cgpi1 + t.cgpi2) / 2;
        System.out.println("Average CGPI : " + cgpi);
        t.show();
        t.display();
    }
}
