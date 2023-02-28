import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Jarvis: Meraha Yusuf Bey");
Toplam(5,6);
    }

    public static void Toplam(int a, int b) {
        int Toplam = a + b;
        System.out.println("Cevap:" + Toplam);


        Random random = new Random();
        int H = random.nextInt();
        int RandomSayi = random.nextInt(10);

            System.out.println("Sayı Giriniz: ");

            Random scanner = new Random(10);
            int girdiginsayi = scanner.nextInt();

            
            if (RandomSayi == girdiginsayi) {
                System.out.println("Bidin");
            } else {
                System.err.printf("Bilemedin!");
            }
            System.out.println("Rastgele Sayı: " + RandomSayi);
        }
    }