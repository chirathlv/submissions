/*
 * Author: Chirath LV
 * Date: 05/12/2022
 * Task: Assignment Submission 1
 */

public class assignment1 {
    public static void main(String args[]) {

        System.out.println("1. Write a program(WAP) to print INEURON using pattern programming logic\n");

        int n = 5; // Letter Grid Size
        int numLetters = 7;
        int extraSpace = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * numLetters + extraSpace; j++) {
                if ((j == n - 2 && i != 1)
                        || j == n
                        || j - i == n
                        || j == 2 * n - 1
                        || j == 2 * n
                        || (i == 0 && j > 2 * n && j < 3 * n - 1)
                        || (i == n / 2 && j > 2 * n && j < 3 * n - 1)
                        || (i == n - 1 && j > 2 * n && j < 3 * n - 1)
                        || j == 3 * n
                        || j == 4 * n - 1
                        || (i == n - 1 && j >= 3 * n && j < 4 * n - 1)
                        || j == 4 * n
                        || (i == 0 && j > 4 * n && j < 5 * n - 2)
                        || (i <= n / 2 && j == 5 * n - 2)
                        || (i == n / 2 && j > 4 * n && j < 5 * n - 2)
                        || ((i > n / 2 && j - i == 5 * n - 2 - (n / 2)))
                        || (i == 0 && j > 5 * n && j < 6 * n + 1)
                        || j == 5 * n + 1
                        || j == 6 * n
                        || (i == n - 1 && j > 5 * n && j < 6 * n + 1)
                        || j == 6 * n + 1
                        || j - i == 6 * n + 1
                        || j == 7 * n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        /************************************************/

        System.out.println("\n2. Write a program to print\n");

        n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }

        /************************************************/

        System.out.println("\n3. WAP to print\n");

        n = 14;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0
                        || j == n - 1
                        || i == n - 1
                        || i + j < (n / 2)
                        || j - i >= (n / 2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        /************************************************/

        System.out.println("\n4. WAP to print\n");

        n = 7;
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j <= i || j >= 2 * n - i - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        /************************************************/

        System.out.println("\n5. WAP to print\n");

        n = 14;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0
                        || i == n - 1
                        || i + j < n / 2
                        || i - j >= n / 2 - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}