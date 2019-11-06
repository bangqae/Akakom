import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int bil;
        System.out.print("Masukkan bilangan = ");
        bil = masuk.nextInt();
        if (bil % 2 == 0) {
            System.out.print("Bilangan genap");
        } else {
            System.out.print("Bilangan ganjil");
        }
    }
}
