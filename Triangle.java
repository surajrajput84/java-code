import java.util.*;

class Area {
    public float area(float b, float h) {
        return 0.5f * b * h;
    }
}

public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Area a = new Area();

        System.out.print("Enter base of triangle: ");
        float base = s.nextFloat();

        System.out.print("Enter height of triangle: ");
        float height = s.nextFloat();

        float ans = a.area(base, height);
        System.out.println("Area of triangle is: " + ans);
    }
}