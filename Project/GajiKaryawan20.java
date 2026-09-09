import java.util.Scanner;
public class GajiKaryawan20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok;
        double bonus;
        int totGaji;
        int tunjTransport = 600000;
        int tunjMakan = 400000;

        System.out.println("Masukkan Gaji Pokok: ");
        gajiPokok = sc.nextInt();
        bonus = 0.05 * gajiPokok;
        totGaji = gajiPokok + tunjTransport + tunjMakan + (int) bonus - (int) (0.1 * gajiPokok);
        System.out.println("Bonus bulanan anda adalah: " + bonus);
        System.out.println("Total Gaji yang diterima adalah: " + totGaji);
        
    }
}
