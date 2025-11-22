
public class Patterns {
    public static void main(String[] args) {

        // 01 Solid rectangle pattern:
        // *****
        // *****
        // *****
        // *****
        int m = 5;
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 02 Hollow Rectangle:4*5 n*m
        // *****
        // * *
        // * *
        // *****

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 03 Half Pyramid:
        // *
        // **
        // ***
        // ****

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 04 Inverted pyramid:
        // ****
        // ***
        // **
        // *

        for (int i = 1; i <= n; i++) {// n=4
            for (int j = n - i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 05 Rotated hafl pyramid
        // *
        // **
        // ***
        // ****

        for (int i = n; i >= 1; i--) {// n=4
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 06 Floyd's triangle : m=5
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        int num = 1;
        for (int i = 0; i <= m; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println();

        // 07 0-1 triangle : m=5
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        for (int i = 1; i <=m; i++) {// 1-5
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= m; i++) {// 1-5
            int val = i % 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                if (val == 1) {
                    val = 0;
                } else {
                    val = 1;
                }

            }
            System.out.println();
        }
        System.out.println();

    }
}
