import java.util.Scanner;
public class MenghitungTotalBayar20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        System.out.println("Harga Barang: ");
        harga = sc.nextDouble();
        potongan = harga * diskon;
        jml_bayar = harga - potongan;
        System.out.println("Jumlah yang harus dibayar adalah: " + jml_bayar);
    }
}
