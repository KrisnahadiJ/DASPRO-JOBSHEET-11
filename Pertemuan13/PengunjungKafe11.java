package Pertemuan13;

public class PengunjungKafe11 {
    public static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar Nama Pengunjung:");
    for (String pengunjung : namaPengunjung) {
        System.out.println("- " + pengunjung);
    }
}

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}