interface Father {
    public void bringWater();
}

interface Mother {
    public void bringWater();
}

public class Son5 implements Father, Mother { 
    public void bringWater() {
        System.out.println("bring water for mother and father");
    }

    public static void main(String args[]) {
        Father f = new Son5();
        f.bringWater();

        Mother m = new Son5();
        m.bringWater();

        Son5 s = new Son5();
        s.bringWater();
    }
}
