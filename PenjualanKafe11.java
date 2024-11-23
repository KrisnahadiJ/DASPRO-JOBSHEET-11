import java.util.Scanner;

public class PenjualanKafe11 {
    static int[][] jmlPenjualan = new int[5][7];
    static String[] namaMenu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void inputDataPenjualan() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < jmlPenjualan.length; i++) {
            System.out.println("Masukkan Jumlah Penjualan untuk " + namaMenu[i] + ": ");
            for (int j = 0; j < jmlPenjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                jmlPenjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilkanData() {
        System.out.println("Data Jumlah Penjualan:");
        System.out.println("Menu\t\tH1\tH2\tH3\tH4\tH5\tH6\tH7");
        for (int i = 0; i < jmlPenjualan.length; i++) {
            System.out.print(namaMenu[i] + (namaMenu[i].length() < 8 ? "\t\t" : "\t"));
            for (int j = 0; j < jmlPenjualan[i].length; j++) {
                System.out.print(jmlPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void penjualanTertinggi() {
        int maxTotal = 0;
        String maxMenu = "";

        for (int i = 0; i < jmlPenjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < jmlPenjualan[i].length; j++) {
                total += jmlPenjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                maxMenu = namaMenu[i];
            }
        }

        System.out.println("Menu dengan penjualan tertinggi: " + maxMenu);
        System.out.println("Total penjualan: " + maxTotal);
        System.out.println();
    }

    public static void rataRataPerMenu() {
        for (int i = 0; i < jmlPenjualan.length; i++) {
            double total = 0;
            for (int j = 0; j < jmlPenjualan[i].length; j++) {
                total += jmlPenjualan[i][j];
            }
            double rata = total / jmlPenjualan[i].length;
            System.out.printf("Rata-rata penjualan menu %s dalam %d hari: %.2f%n", namaMenu[i], jmlPenjualan[i].length, rata);
        }
    }

    public static void main(String[] args) {
        inputDataPenjualan();
        tampilkanData();
        penjualanTertinggi();
        rataRataPerMenu();
    }
}