public class Main {
    public static void main(String[] args) {
//Задание 1
        int[] a = new int[12];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        {
            int[] box = new int[5];
            box[0] = 22;
            box[1] = 1;
            box[2] = 25;
            box[3] = 11;
            box[4] = 21;
            char[] sammerDays = {12, 22, 31};
        }

// Задача 2
        for (int i = 0; i <= 2; i++) {
            if (i == 2) {
                System.out.print(a[2]);
            } else {
                System.out.print(a[i] + ",");
            }
        }
        System.out.println(" ");

        for (int c = 0; c < b.length; c++) {
            if (c == 2) {
                System.out.println(b[2]);
            } else {
                System.out.print(b[c] + ",");
            }
        }
        System.out.println(" ");

//// Задача 3
        for (int n = 2; n >= 0; n--) {
            if (n == 0) {
                System.out.print(a[0]);
            } else {
                System.out.print(a[n] + ",");
            }
        }
        System.out.println(" ");
        for (int k = 2; k >= 0; k--) {
            if (k == 0) {
                System.out.println(b[0]);
            } else {
                System.out.print(b[k] + ",");
            }
        }

// Задание 4
        for (int i = 0; i > a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            } else {
                if (a[i] % 2 != 0) {
                    System.out.println(a[i]++);

                }
            }

        }
    }}