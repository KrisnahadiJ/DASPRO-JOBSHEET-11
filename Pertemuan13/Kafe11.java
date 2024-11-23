package Pertemuan13;
import java.util.Scanner;

public class Kafe11 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Berikan diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Berikan diskon 30%.");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam    - Rp 15,000");
        System.out.println("2. Cappuccino    - Rp 20,000");
        System.out.println("3. Latte         - Rp 22,000");
        System.out.println("4. Teh Tarik     - Rp 12,000");
        System.out.println("5. Roti Bakar    - Rp 10,000");
        System.out.println("6. Mie Goreng    - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal / 2; // Diskon 50%
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal * 70 / 100; // Diskon 30%
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada pengurangan harga.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");

        Scanner sc = new Scanner(System.in);

        int totalKeseluruhan = 0;
        boolean lanjutkanPesanan = true;

        while (lanjutkanPesanan) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            System.out.print("Masukkan kode promo (jika ada): ");
            sc.nextLine(); // Konsumsi newline
            String kodePromo = sc.nextLine();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.println("Total harga untuk pesanan ini: Rp " + totalHarga);

            System.out.print("Apakah Anda ingin memesan lagi? (y/n): ");
            String jawaban = sc.nextLine();
            if (jawaban.equalsIgnoreCase("n")) {
                lanjutkanPesanan = false;
            }
        }

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp " + totalKeseluruhan);
    }
}
