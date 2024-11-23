import java.util.Scanner;

public class Percobaan11 {

    static int hitungLuas(int p, int l) {
        return p * l;
    }

    static int hitungVolume(int t, int p, int l) {
        return hitungLuas(p, l) * t;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();

        System.out.print("Masukkan lebar: ");
        l = input.nextInt();

        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        int luas = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah: " + luas);

        int volume = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah: " + volume);
    }
}