
import java.util.Scanner;

public class ans6 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        num = sc.nextInt();
        int result = ans6(num);
        System.out.print("Sum of Digits in the given number " + num + " is " + result);
    }
    static int ans6(int n) {
        if ( n == 0) {
            return 0;
        } else {
            return ( n % 10 + ans6(n /10));
        }

        }
 }
