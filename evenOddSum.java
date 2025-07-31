import java.util.*;

public class EvenOddSum {
    public static void main(String args[]) {
        int n, sumE = 0, sumO = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        n = s.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is even");
                sumE = sumE+ a[i];
            } else {
                System.out.println(a[i] + " is odd");
                sumO =sumO+ a[i];             }
        }

        System.out.println("The sum of even numbers is " + sumE);
        System.out.println("The sum of odd numbers is " + sumO);
    }
}
