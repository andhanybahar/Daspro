import java.util.Scanner;
public class MenghitungLuasPersegiPanjang20 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;
        System.out.print("Masukkan panjang: ");

        panjang = sc14.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = sc14.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }
}

    