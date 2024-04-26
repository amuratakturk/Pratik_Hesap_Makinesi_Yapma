//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        //Kullanıcıdan değişkenler alındı.
        Scanner input = new Scanner(System.in);
        System.out.println("ilk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("İŞLEMİNİZ : ");
        select = input.nextInt();
        //Koşul bloğu eklenerek doğru sonuç yazdırılması sağlandı.


        switch (select) {
            case 1:
                System.out.println(" Toplam :  " + (n1 + n2));
                System.out.println(" Program Bitti");
                break;
            case 2:
                System.out.println(" Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " ve " + n2 + " Çarpım " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println ( n1 + " ve " + n2 + " sayıların bölümü " + (n1 / n2));
                } else  {
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                break;
            default:
                System.out.println("Lütfen verilmiş olan değerlerden birini seçiniz.");
                break;
        }


    }
}
