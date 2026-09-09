import java.util.Scanner;

public class KreditLaptop20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Harga laptop (Rp): ");
        double hargaLaptop = sc.nextDouble();

        System.out.print("Uang muka (Rp): ");
        double uangMuka = sc.nextDouble();

        System.out.print("Lama cicilan (bulan): ");
        int lamaCicilan = sc.nextInt();

        double sisaHarga = hargaLaptop - uangMuka;
        double bunga = 0.02 * sisaHarga;
        double totalBayar = sisaHarga + bunga;
        double cicilanPerBulan = totalBayar / lamaCicilan;

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Sisa harga setelah uang muka: Rp " + sisaHarga);
        System.out.println("Bunga 2%: Rp " + bunga);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
        System.out.println("Cicilan per bulan: Rp " + cicilanPerBulan);
    }
}
