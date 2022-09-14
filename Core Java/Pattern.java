
public class Pattern {
    public static void main(String[] args) {


        //pattern Above Code Below

        /*
         * * * * * * * * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * * * * * * * *
         */

        // int n=7;
        // for (int i = 1; i <= 2 * n; i++) {
        // if (i <= n) {

        // if (i == 1) {
        // for (int k = 1; k <= 2 * n; k++) {
        // System.out.print(" *");

        // }

        // } else {
        // for (int k = 0; k <= n - i; k++) {
        // System.out.print(" *");

        // }
        // }

        // } else {

        // if (i == 2 * n) {
        // for (int k = 1; k <= 2 * n; k++) {
        // System.out.print(" *");

        // }

        // } else {
        // for (int k = 0; k <= i - n; k++) {
        // System.out.print(" *");

        // }
        // }
        // }
        // System.out.println();

        // }

        /*
         * 1 1 1 1
         * 2 2 2 2
         * 3 3 3 3
         * 4 4 4 4
         */

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();

        // }








        /*
 * * * * * * * * * * * * * *
 * * * * * *     * * * * * *
 * * * * *         * * * * *
 * * * *             * * * *
 * * *                 * * *
 * *                     * *
 *                         *
 *                         *
 *                         *
 *                         *
 *                         *
 *                         *
 *                         *
 * * * * * * * * * * * * * *
         */

        // int n = 7;
        // for (int i = 1; i <= n * 2; i++) {
        //     if (i <= n) {

        //         for (int j = 0; j <= n - i; j++) {
        //             System.out.print(" *");
        //         }
        //         for (int s = 2; s < i + i; s++) {
        //             System.out.print("  ");
        //         }
        //         for (int j = 0; j <= n - i; j++) {
        //             System.out.print(" *");
        //         }
        //         System.out.println();
        //     } else {
        //         for (int f = 1; f <= n * 2; f++) {
        //             if (i == n * 2 || f == 1 || f == n * 2) {
        //                 System.out.print(" *");
        //             } else {
        //                 System.out.print("  ");
        //             }

        //         }

        //         System.out.println();
        //     }
        // }

        /*
 *   *           *   * * * * * * *   *           *   * * * * * * *   * * * * * * *   *           *
 *   * *         *   *               *           *   *           *   *           *   * *         *     
 *   *   *       *   *               *           *   * * * * * * *   *           *   *   *       *     
 *   *     *     *   * * * * * * *   *           *   * *             *           *   *     *     *     
 *   *       *   *   *               *           *   *   *           *           *   *       *   *     
 *   *         * *   *               *           *   *     *         *           *   *         * *     
 *   *           *   * * * * * * *   * * * * * * *   *       *       * * * * * * *   *           *     
         
         */
        // int n=7;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= 1; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.print("  ");
        //     for (int j = 1; j <= n; j++) {
        //         if (j == 1 || j == n || j == i) {
        //             System.out.print(" *");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j = 1; j <= n; j++) {
        //         if (j == 1 || i == 1 || i == n || i == (n / 2)+1) {
        //             System.out.print(" *");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j = 1; j <= n; j++) {
        //         if (j == 1 || j == n && j != n - 1 || i == n) {
        //             System.out.print(" *");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }

        //     System.out.print("  ");
        //     for (int j = 1; j <= n; j++) {
        //         if (j == 1 || i == 1 || i == n / 2 || i == (n / 3) && j == n || j == i - 2) {
        //             System.out.print(" *");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j = 1; j <= n; j++) {
        //         if (j == 1 && i != 1 && i != n || i == 1 || i == n || j == n) {
        //             System.out.print(" *");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j = 1; j <= n; j++) {
        //         if (j == 1 || j == n || j == i) {
        //             System.out.print(" *");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }

        //     System.out.println();
        // }

        /*
 *                         *
 * *                     * *
 * * *                 * * *
 * * * *             * * * *
 * * * * *         * * * * *
 * * * * * *     * * * * * *
 * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * 
         */

        // int n = 8;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" *");
        //     }
        //     for (int j = 2; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 2; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }

        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" *");
        //     }

        //     System.out.println();
        // }

    }
}
