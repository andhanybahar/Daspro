import java.util.Scanner;
public class Bank20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlhTabunganAwal, lamaMenabung;
        double persentaseBunga = 0.02, bunga, tabunganAkhir;

        System.out.print("Masukkan jumlah tabungan awal: ");
        jmlhTabunganAwal = input.nextInt();
        System.out.print("Masukkan lama menabung (dalam bulan): ");
        lamaMenabung = input.nextInt();

        bunga = lamaMenabung * persentaseBunga * jmlhTabunganAwal;
        tabunganAkhir = jmlhTabunganAwal + bunga;

        System.out.println("bunga nya adalah" + bunga);
        System.out.println("Jumlah tabungan akhir adalah: " + tabunganAkhir);
    }
}
