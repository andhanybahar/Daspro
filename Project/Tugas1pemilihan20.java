import java.util.Scanner;
public class Tugas1pemilihan20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print("Apakah UKT SUDAH LUNAS? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas
                ? "Pembayaran ukt terverifikasi\nSilahkan cetak KRS Dan tanda tangan DPA"
                : "Registrasi Ditolak\nSilahkan lakukan pembayaran ukt terlebih dahulu";

        System.out.println(pesan);
    }
}