import java.util.Scanner;

public class BiayaCetak20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah lembar dokumen: ");
        int jumlahLembar = sc.nextInt();

        double biayaPerLembar = 500; 
        double biayaPenjilidan = 5000; 

        double totalBiaya = (jumlahLembar * biayaPerLembar) + biayaPenjilidan;

        System.out.println("Jumlah lembar: " + jumlahLembar);
        System.out.println("Biaya cetak per lembar: Rp" + biayaPerLembar);
        System.out.println("Biaya penjilidan: Rp" + biayaPenjilidan);
        System.out.println("Total biaya yang harus dibayar: Rp" + totalBiaya);
    }
}
