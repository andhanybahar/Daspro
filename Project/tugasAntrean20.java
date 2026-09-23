import java.util.Scanner;

public class tugasAntrean20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- ANTREAN AKADEMIK ---");
        System.out.print("Masukkan kode layanan: ");
        int kode = sc.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Kartu Mahasiswa");
                break;
            case 2:
                System.out.println("Layanan Akademik");
                break;
            case 3:
                System.out.println("Transkrip Nilai");
                break;
            case 4:
                System.out.println("Administrasi Uang Kuliah");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }
    }
}
