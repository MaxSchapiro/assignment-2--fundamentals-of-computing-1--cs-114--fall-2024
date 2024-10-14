import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer for the diamond's width and height
        System.out.print("Enter an odd number for the diamond's width/height: ");
        int n = scanner.nextInt();

        // Ensure the user enters a positive odd number greater than 1
        if (n % 2 == 0 || n < 1) {
            System.out.println("Please enter a valid odd number greater than 1.");
        } else {
            // Upper half of the diamond
            for (int i = 1; i <= n / 2 + 1; i++) {
                // Print leading spaces
                for (int j = i; j <= n / 2; j++) {
                    System.out.print(" ");
                }

                // Print stars for the upper half
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }

                // Move to the next line
                System.out.println();
            }

            // Lower half of the diamond
            for (int i = n / 2; i >= 1; i--) {
                // Print leading spaces
                for (int j = n / 2; j >= i; j--) {
                    System.out.print(" ");
                }

                // Print stars for the lower half
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }

                // Move to the next line
                System.out.println();
            }
        }
        // Close the scanner
        scanner.close();
    }
}
