import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter an integer");
        Scanner n = new Scanner(System.in);
        num = n.nextInt();
        n.close();// close the scanner

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else
            System.out.println("Odd number");

    }
}
