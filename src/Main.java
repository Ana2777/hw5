public class Main {
    public static void main(String[] args) {
//Задание 1
        int[] a = new int[12];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};

        int[] box = new int[5];
        box[0] = 22;
        box[1] = 1;
        box[2] = 25;
        box[3] = 11;
        box[4] = 21;
        char[] sammerDays = {12, 22, 31};

// Задача 2
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ",");
            }
        }
        System.out.println(" ");

        for (int c = 0; c < b.length; c++) {
            if (c == b.length - 1) {
                System.out.println(b[c]);
            } else {
                System.out.print(b[c] + ",");
            }
        }
        System.out.println(" ");

        for (int p = 0; p < box.length; p++) {
            if (p == 0) {
                System.out.print(box[p]);
            } else {
                ;
                System.out.println(box[p] + ",");
            }
            System.out.println(" ");
// Задача 3
            for (int n = a.length - 1; n >= 0; n--) {
                if (n == 0) {
                    System.out.print(a[n]);
                } else {
                    System.out.print(a[n] + ",");
                }
            }
            System.out.println(" ");

            for (int k = b.length - 1; k >= 0; k--) {
                if (k == 0) {
                    System.out.println(b[k]);
                } else {
                    System.out.print(b[k] + ",");
                }
            }
            System.out.println(" ");

            for (int e = box.length - 1; e >= 0; e--) {
                if (e == 0) {
                    System.out.print(box[e]);
                } else {
                    System.out.print(box[e] + ",");
                }
            }

            System.out.println(" ");
/// Задание 4
            for (int v = 0; v < a.length; v++) {
                if (a[v] % 2 == 1) {
                    a[v]++;
                    System.out.println(a[v]);
                } else if (v != a[v] - 1) {
                    System.out.println(a[v] + ", ");

                }
            }


        }
    }
}

