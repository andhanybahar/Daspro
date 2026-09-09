public class contohOperator20 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x++ = " + x++);
        System.out.println("Setelah Evaluasi,x = " + x);
        x = 10;
        System.out.println("++x = " + ++x);
        System.out.println("Setelah Evaluasi, x = " + x);
        int y = 12;
        System.out.println("x > y || x == y && y <= x = " + (x > y || x == y && y <= x)); //x lebih besar dari y atau x sama dengan y dan y lebih kecil sama dengan x
        int z = x ^ y;
        System.out.println("Hasil x ^ y adalah: " + z); 
        z %= 2;
        System.out.println("Hasil Akhir " + z);
    }
}