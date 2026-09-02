import java.util.Scanner;
public class studiKasus1_pert3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int GajiPokok, tunjanganAnak, jumlahAnak;
        double GajiAkhir;

        System.out.print("Masukkan gaji pokok: ");
        GajiPokok = input.nextInt();
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = input.nextInt();

        tunjanganAnak = jumlahAnak * 100000;
        GajiAkhir = GajiPokok - (GajiPokok * 0.10);

        System.out.println("Tunjangan anak: " + tunjanganAnak);
        System.out.println("Gaji akhir: " + GajiAkhir);
    }
}
