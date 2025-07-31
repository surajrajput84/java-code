import java.util.*;

public class Factorial {

    
    public static int fact(int n) {
	int total=1;
        if (n >= 1){
		total=n*fact(n-1);
		}
        
            return total;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();

        
        int ans = fact(num);
        System.out.println("Factorial of is: " +ans);
    }
}
