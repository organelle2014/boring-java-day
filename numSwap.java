import java.util.Scanner;

public class numSwap {
    // swaping numbers
    public static void main(String[] args) {

        int a, b;

        Scanner n = new Scanner(System.in);
        System.out.println("Enter first int");
        a = n.nextInt();
        System.out.println("Enter the second int");
        b = n.nextInt();
        n.close(); // close scanners

        System.out.println("Original " + a + " and  " + b);
        // swapping
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped " + a + " and " + b);

    }
}
