import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        System.out.println("Lütfen Sayı Giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n ; i > 0 ; i--) {
            for (int j = 0; j < n-i ; j++) {
                System.out.printf(" ");

            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.printf("+");
            }
            System.out.printf("");
        }

    }

}
