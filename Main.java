import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Interest i = new Interest();
        System.out.println("Enter the deposit amount");
        double d = sc.nextDouble();
        System.out.println("Enter the time in years");
        int t = sc.nextInt();
        System.out.println("The compound interest is: " + i.calculateInterest(d, t));
    }
}
