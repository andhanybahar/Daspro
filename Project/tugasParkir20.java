import java.util.Scanner;

public class tugasParkir20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan lama parkir (jam): ");
        int jam = sc.nextInt();

        if (jam > 3) {
            int penalti = (jam - 3) * 5000;
            System.out.println("Kendaraan parkir lebih dari 3 jam");
            System.out.println("Penalti yang harus dibayar: Rp " + penalti);
        } else {
            System.out.println("Kendaraan parkir tidak dikenakan penalti.");
        }
    }
}
