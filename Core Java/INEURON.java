public class INEURON {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.print(" *");
            }
            System.out.print("  ");
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || j == i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == n || i == (n / 2)+1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n && j != n - 1 || i == n) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == n / 2 || i == (n / 3) && j == n || j == i - 2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 1; j <= n; j++) {
                if (j == 1 && i != 1 && i != n || i == 1 || i == n || j == n) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || j == i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}