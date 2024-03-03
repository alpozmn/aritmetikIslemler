import java.util.Scanner;

public class Pratik {
    public static void main(String[] args) {
        // Kullanıcıdan sayıları al
        Scanner scanner = new Scanner(System.in);

        System.out.print("a sayısını giriniz: ");
        int a = scanner.nextInt();

        System.out.print("b sayısını giriniz: ");
        int b = scanner.nextInt();

        System.out.print("c sayısını giriniz: ");
        int c = scanner.nextInt();

        // İşlemi hesapla
        int sonuc = a + b * c - b;

        // Sonucu ekrana yazdır
        System.out.println("İşlemin sonucu: " + sonuc);

        // Scanner nesnesini kapat
        scanner.close();
    }
}
