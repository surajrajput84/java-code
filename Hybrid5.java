interface Father {
    void property();
}

interface Mother {
    void property();
}

class Child implements Father, Mother {
    public void property() {
        System.out.println("in property of child");
    }

   
}

 class GrandChild1 extends Child {
    }
 class GrandChild2 extends Child {
    }

public class Hybrid5{
    public static void main(String[] args) {
        Child c = new Child();
        c.property();
	 GrandChild1 g= new GrandChild1();
        g.property();
	 GrandChild2 g2 = new GrandChild2();
        g2.property();
    }
}
