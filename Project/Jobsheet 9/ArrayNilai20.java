import java.util.Arrays;
import java.util.Scanner;

public class ArrayNilai20 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        int no = 1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + no + ": " + nilai + " (" + status + ")");
            no++;
        }
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
            if (nilaiAkhir[i] > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        System.out.println("Jumlah mahasiswa lulus       : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);
        }
    }

