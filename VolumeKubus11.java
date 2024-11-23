import java.util.Scanner;

public class VolumeKubus11 {
    static int volumeKubus(int s) {
        int volume = s * s * s;
        return volume;
    }

    static int luasPermukaanKubus(int s) {
        int luas = 6 * (s * s);
        return luas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int panjang = sc.nextInt();

        System.out.println("Volume Kubus adalah: " + volumeKubus(panjang));
        System.out.println("Luas Permukaan Kubus adalah: " + luasPermukaanKubus(panjang));
    }
}