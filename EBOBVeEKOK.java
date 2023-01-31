package Donguler;

import java.util.Scanner;

public class EBOBVeEKOK {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        int a = inp.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        int b = inp.nextInt();

        // EBOB

        int ebob = 1;

        if (a >= b) {
            int i = b;
            while (i != 0) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                    break;
                }
                i--;
            }
            System.out.println(a + " ve " + b + " sayılarının En Büyük Ortak Böleni : " + ebob);
        } else {
            int i = a;
            while (i != 0) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                    break;
                }
                i--;
            }
            System.out.println(a + " ve " + b + " sayılarının En Büyük Ortak Böleni : " + ebob);
        }

        // EKOK

        int ekok = a * b;

        if (a >= b) {
            int i = a;
            while (i != (a * b)) {
                if (i % a == 0 && i % b == 0) {
                    ekok = i;
                    break;
                }
                i++;
            }
            System.out.println(a + " ve " + b + " sayılarının En Küçük Ortak Katı : " + ekok);
        } else {
            int i = b;
            while (i != (a*b)) {
                if (i % a == 0 && i % b == 0) {
                    ekok = i;
                    break;
                }
                i++;
            }
            System.out.println(a + " ve " + b + " sayılarının En Küçük Ortak Katı : " + ekok);
        }
    }
}
