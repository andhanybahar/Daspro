import java.util.Scanner;
public class studiKasus2_pert3 {
    public static void main(String[] args) {
        
        double panjang, lebar, diameter, sisi;
        double luasTanah, luasKolam, luasTaman, luasTidakDigunakan;
 
        Scanner input = new Scanner(System.in);
 
        // Input data tanah
        System.out.print("Masukkan panjang tanah (meter): ");
        panjang = input.nextDouble();
 
        System.out.print("Masukkan lebar tanah (meter): ");
        lebar = input.nextDouble();
 
        // Input data kolam ikan (lingkaran)
        System.out.print("Masukkan diameter kolam ikan (meter): ");
        diameter = input.nextDouble();
 
        // Input data taman bunga (persegi)
        System.out.print("Masukkan sisi taman bunga (meter): ");
        sisi = input.nextDouble();
 
        // Perhitungan luas
        luasTanah = panjang * lebar;
        luasKolam = Math.PI * (diameter / 2) * (diameter / 2);
        luasTaman = sisi * sisi;
        luasTidakDigunakan = luasTanah - luasKolam - luasTaman;
 
        // Menampilkan hasil
        System.out.println("\n HASIL PERHITUNGAN");
        System.out.println("Luas tanah          : " + luasTanah + " m2");
        System.out.println("Luas kolam ikan      : " + luasKolam + " m2");
        System.out.println("Luas taman bunga     : " + luasTaman + " m2");
        System.out.println("Luas tanah yang tidak digunakan : " + luasTidakDigunakan + " m2");

    }
}
