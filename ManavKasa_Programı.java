import java.util.Random;
import java.util.Scanner;

public class ManavKasa_Programı {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "TL";
        Random r = new Random();
        double elma = r.nextDouble(50);
        double patlican = r.nextDouble(50);
        double muz = r.nextDouble(50);
        double seftali = r.nextDouble(50);
        double kabak = r.nextDouble(50);
        double domates = r.nextDouble(50);
        double armut = r.nextDouble(50);
        System.out.println("****************************************");
        System.out.printf("Elmanin kg fiyati : " + "%.2f %s\n", elma, str);
        System.out.printf("Patlicanin kg fiyati : " + "%.2f %s\n", patlican, str);
        System.out.printf("Muzun kg fiyati : " + "%.2f %s\n", muz, str);
        System.out.printf("Şeftalinin kg fiyati : " + "%.2f %s\n", seftali, str);
        System.out.printf("Kabağin kg fiyati : " + "%.2f %s\n", kabak, str);
        System.out.printf("Domatesin kg fiyati: " + "%.2f %s\n", domates, str);
        System.out.printf("Armutun kg fiyati : " + "%.2f %s\n", armut, str);
        System.out.println("****************************************");
        String[] urun = { "Elma", "patlican", "muz", "seftali", "kabak", "domates", "armut" };
        double[] br_fiyat = { elma, patlican, muz, seftali, kabak, domates, armut };
        double[] tutar = new double[7];

        System.out.print("kaç kilo elma almak istersin : ");
        int e = scanner.nextInt();
        System.out.print("kaç kilo patlican almak istersin : ");
        int p = scanner.nextInt();
        System.out.print("kaç kilo muz almak istersin : ");
        int m = scanner.nextInt();
        System.out.print("kaç kilo seftali almak istersin : ");
        int s = scanner.nextInt();
        System.out.print("kaç kilo kabak almak istersin : ");
        int k = scanner.nextInt();
        System.out.print("kaç kilo domates almak istersin : ");
        int d = scanner.nextInt();
        System.out.print("kaç kilo armut almak istersin : ");
        int a = scanner.nextInt();
        int[] miktar = { e, p, m, s, k, d, a };
        System.out.println("urun           miktar   br_fiyat     tutar");
        System.out.println("*********************************************");
        for (int i = 0; i < 7; i++) {

            System.out.printf("%-10s   %5.1fkg    %05.2fTL   %05.2fTL\n", urun[i], (double) miktar[i], br_fiyat[i],
                    br_fiyat[i] * miktar[i]);
        }
        double toplam_miktar = 0;
        for (int i = 0; i < 7; i++) {
            toplam_miktar += miktar[i];

        }
        double toplam_odenecek_tutar = 0;
        for (int i = 0; i < 7; i++) {
            toplam_odenecek_tutar += br_fiyat[i] * miktar[i];
        }
        System.out.println("*************************************************");
        System.out.printf("%5.2f kg ----> ALIŞVERİŞ YAPTINIZ \n%5.2fTL ----> ÖDENECEK TUTAR",toplam_miktar,toplam_odenecek_tutar);
    }
}