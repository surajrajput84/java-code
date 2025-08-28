abstract class Shape {
    abstract void draw();

    void display() {
        System.out.println("This is a shape");
    }
}

class Circle4 extends Shape {
    
    void draw() {
        System.out.println("Drawing a Circle");
    }
	    public static void main(String[] args) {
        Shape c = new Circle4();
        c.display();
        c.draw();
    }
}
