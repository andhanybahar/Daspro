import java.util.Locale;
import java.util.Scanner;
public class PemesananKafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         Locale id = Locale.forLanguageTag("id-ID");
 
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                         "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
 
        String pilihan;
        do {
            System.out.println();
            System.out.println("===== KAFE KAMPUS =====");
            System.out.println("1. Lihat daftar menu");
            System.out.println("2. Cari menu");
            System.out.println("3. Buat pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextLine().trim();
 
            switch (pilihan) {
                case "1":
                    System.out.println();
                    System.out.println("----- DAFTAR MENU -----");
                    for (int i = 0; i < menu.length; i++) {
                        System.out.printf(id, "%d. %-16s Rp %,d%n", (i + 1), menu[i], harga[i]);
                    }
                    break;
 
                case "2":
                    // fitur pencarian: linear search pada array menu
                    System.out.print("Masukkan nama menu yang dicari: ");
                    String cari = input.nextLine().trim();
                    int hasil = -1;
                    for (int i = 0; i < menu.length; i++) {
                        if (menu[i].equalsIgnoreCase(cari)) {
                            hasil = i;
                            break;
                        }
                    }
                    if (hasil != -1) {
                        System.out.printf(id, "Menu ditemukan: %s, harga Rp %,d%n", menu[hasil], harga[hasil]);
                    } else {
                        System.out.println("Menu \"" + cari + "\" tidak tersedia.");
                    }
                    break;
 
                case "3":
                    // fitur pemesanan
                    System.out.print("Masukkan jumlah item yang dipesan: ");
                    int jumlah = input.nextInt();
                    input.nextLine();   // buang sisa baris setelah nextInt
 
                    if (jumlah <= 0) {
                        System.out.println("Jumlah item harus lebih dari 0.");
                        break;
                    }
 
                    String[] pesanan = new String[jumlah];       // array pesanan (terpisah dari menu)
                    int[] hargaPesanan = new int[jumlah];
                    int totalBiaya = 0;
 
                    for (int i = 0; i < pesanan.length; i++) {
                        int idx;
                        do {                                      // ulangi sampai nama menu valid
                            System.out.print("Item ke-" + (i + 1) + ", nama menu: ");
                            String nama = input.nextLine().trim();
                            idx = -1;
                            for (int j = 0; j < menu.length; j++) {
                                if (menu[j].equalsIgnoreCase(nama)) {
                                    idx = j;
                                    break;
                                }
                            }
                            if (idx == -1) {
                                System.out.println("Menu tidak tersedia. Ulangi input!");
                            }
                        } while (idx == -1);
 
                        pesanan[i] = menu[idx];
                        hargaPesanan[i] = harga[idx];
                        totalBiaya += harga[idx];
                    }
 
                    // tampilkan daftar pesanan dan total biaya
                    System.out.println();
                    System.out.println("========= DAFTAR PESANAN =========");
                    System.out.printf("%-4s%-18s%12s%n", "No", "Menu", "Harga");
                    System.out.println("----------------------------------");
                    for (int i = 0; i < pesanan.length; i++) {
                        System.out.printf(id, "%-4d%-18s%12s%n", (i + 1), pesanan[i],
                                String.format(id, "Rp %,d", hargaPesanan[i]));
                    }
                    System.out.println("----------------------------------");
                    System.out.printf(id, "%-22s%12s%n", "Total biaya",
                            String.format(id, "Rp %,d", totalBiaya));
                    System.out.println("==================================");
                    break;
 
                case "0":
                    System.out.println("Terima kasih telah berkunjung.");
                    break;
 
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (!pilihan.equals("0"));
 
        input.close();
    }
}
