import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Banyaknya nilai harus lebih dari 0.");
        } else {
            int[] nilai = new int[n];
            int total = 0;

            // input setiap nilai (valid 0-100), sekaligus akumulasi total
            for (int i = 0; i < nilai.length; i++) {
                do {
                    System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                    nilai[i] = input.nextInt();
                    if (nilai[i] < 0 || nilai[i] > 100) {
                        System.out.println("Nilai harus 0-100. Ulangi input!");
                    }
                } while (nilai[i] < 0 || nilai[i] > 100);
                total += nilai[i];
            }

            // rata-rata
            double rata2 = (double) total / nilai.length;

            // nilai tertinggi dan terendah
            int tertinggi = nilai[0];
            int terendah = nilai[0];
            for (int i = 1; i < nilai.length; i++) {
                if (nilai[i] > tertinggi)
                    tertinggi = nilai[i];
                if (nilai[i] < terendah)
                    terendah = nilai[i];
            }

            // tampilkan semua nilai beserta status kelulusan
            System.out.println();
            System.out.println("===== DAFTAR NILAI =====");
            for (int i = 0; i < nilai.length; i++) {
                String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
            }

            System.out.println("========================");
            System.out.println("Rata-rata      : " + rata2);
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah : " + terendah);
        }
        input.close();
    }
}
