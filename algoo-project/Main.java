import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        System.out.print("Enter number of queries: ");
        int q = input.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.print("Enter l and r: ");
            int l = input.nextInt(); 
            int r = input.nextInt(); 

            if (l < 0 || r >= n || l > r) {
                System.out.println("Invalid");
            } else {
                int sum = prefix[r + 1] - prefix[l];
                System.out.println("Sum = " + sum);
            }
        }

        input.close();
    }
}