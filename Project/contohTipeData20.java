import java.util.Scanner;

public class contohTipeData20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char golonganDarah = 'O';
        byte jarak = (byte) 130;
        short jumlahPendudukDalamSatuDusun = 1024;
        float suhuTubuh = 36.5F;
        double beratBadan = 0.5295843921;
        long saldoRekening = 1000000000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan darah\t\t\t\t\t\t: " + (byte) golonganDarah);
        System.out.println("Jarak\t\t\t\t\t\t: " + jarak);
        System.out.println("Jumlah penduduk dalam satu dusun\t\t: " + jumlahPendudukDalamSatuDusun);
        System.out.println("Suhu tubuh\t\t\t\t\t: " + suhuTubuh);
        System.out.println("Berat badan\t\t\t\t\t\t\t\t: " + (float) beratBadan);
        System.out.println("Saldo rekening\t\t\t\t\t: " + saldoRekening);
        System.out.println("Angka desimal\t\t\t\t\t: " + angkaDesimal);
    }
}
