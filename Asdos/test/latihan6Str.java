import java.util.Scanner;

public class latihan6Str {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        String pil;
        System.out.println("Menu Dealer");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Pilihan : ");
        pil = masuk.nextLine();
        if (pil == "Mobil") {
            System.out.println("----------");
            System.out.println("Menu Mobil");
            System.out.println("1. Jazz");
            System.out.println("2. Brio");
            System.out.println("3. Mobilio");
            System.out.print("Pilihan : ");
            pil = masuk.nextLine();
            if (pil == "Jazz") {
                System.out.println("----------");
                System.out.println("Harga Jazz");
                System.out.println("Rp 1000");
            } else if (pil == "Brio") {
                System.out.println("----------");
                System.out.println("Harga Brio");
                System.out.println("Rp 2000");
            } else if (pil == "Mobilio") {
                System.out.println("----------");
                System.out.println("Harga Mobilio");
                System.out.println("Rp 3000");
            }
        } else if (pil == "Motor") {
            System.out.println("----------");
            System.out.println("Menu Motor");
            System.out.println("1. Vario");
            System.out.println("2. Beat");
            System.out.println("3. Vixion");
            System.out.print("Pilihan : ");
            pil = masuk.nextLine();
            if (pil == "Vario") {
                System.out.println("----------");
                System.out.println("Harga Vario");
                System.out.println("Rp 1000");
            } else if (pil == "Beat") {
                System.out.println("----------");
                System.out.println("Harga Beat");
                System.out.println("Rp 2000");
            } else if (pil == "Vixion") {
                System.out.println("----------");
                System.out.println("Harga Vixion");
                System.out.println("Rp 3000");
            }
        }
    }
}