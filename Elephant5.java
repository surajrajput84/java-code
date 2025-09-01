interface Animal {
    public void voice();
}

public class Elephant5 implements Animal {
   
    public void voice() {
        System.out.println("elephant voice");
    }

    public static void main(String args[]) {
        Animal a = new Elephant5();
        a.voice();
    }
}
