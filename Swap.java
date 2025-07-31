import java.util.*;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
       
    System.out.println("before swapping, value of a: " + a + ", value of b: " + b);
b=a+b;
a=b-a;
b=b-a;
       System.out.println("After swapping, value of a: " + a + ", value of b: " + b);
    }
}
