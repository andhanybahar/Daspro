import java.util.Scanner;
public class PemilihanIf20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print("Apakah UKT SUDAH LUNAS? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran ukt terverifikasi");
            System.out.println("Silahkan cetak KRS Dan tanda tangan DPA");

        } else {
            System.out.println("Registrasi Ditolak");
            System.out.println("Silahkan lakukan pembayaran ukt terlebih dahulu");
        }
    }
}
