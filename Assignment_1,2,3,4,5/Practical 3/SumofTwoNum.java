import java.util.Scanner;
public class SumofTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int n2 = sc.nextInt();

        int sum = n1 + n2;

        System.out.println("Sum of Two numbers = " + sum);

        sc.close();
}
}

