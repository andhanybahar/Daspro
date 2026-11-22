import java.util.Scanner;
public class BioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int baris, kolom;
        String nama, pilihan, lagi;
        String[][] penonton = new String[4][2];

        do {
            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextLine();

            if (pilihan.equals("1")) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    // ulangi baris & kolom sampai valid dan kursi masih kosong
                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > penonton.length) {
                            System.out.println("Baris tidak tersedia. Pilih baris 1-" + penonton.length + ".");
                        } else if (kolom < 1 || kolom > penonton[baris - 1].length) {
                            System.out
                                    .println("Kolom tidak tersedia. Pilih kolom 1-" + penonton[baris - 1].length + ".");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1]
                                    + ". Pilih kursi lain.");
                        } else {
                            break;
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    lagi = sc.nextLine();
                    if (lagi.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (pilihan.equals("2")) {
                System.out.println();
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(isi + "\t");
                    }
                    System.out.println();
                }
            } else if (!pilihan.equals("3")) {
                System.out.println("Menu tidak valid.");
            }
        } while (!pilihan.equals("3"));

        System.out.println("Terima kasih.");
        sc.close();
    }
}