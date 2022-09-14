public class DoorPatten {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n * 2; i++) {
            if (i <= n) {

                for (int j = 0; j <= n - i; j++) {
                    System.out.print(" *");
                }
                for (int s = 2; s < i + i; s++) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= n - i; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            } else {
                for (int f = 1; f <= n * 2; f++) {
                    if (i == n * 2 || f == 1 || f == n * 2) {
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }

                }

                System.out.println();
            }
        }
    }
}
