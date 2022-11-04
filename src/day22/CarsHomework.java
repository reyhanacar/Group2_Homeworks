package day22;

import java.util.Scanner;

public class CarsHomework {
    public static void main(String[] args) {
       /* String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};

        dizisini oluşturup, ekranda sıra numaralarıyla listeleyiniz.
        1. Honda
        2. Toyota
...     şeklinde olacaktır.

        Listenin en altında kullanıcıdan seçim yapması istenilecektir.

                Kullanıcının seçtiği arabaya uygun fiyat;
        Seçtiğiniz araba   %s, fiyatı %d. İyi günlerde kullanın.
        Şeklinde gösterilecektir.

        Not 1: Arabaların fiyatı seçildikleri anda rastgele (randomly) üretilecektir.
                Honda – Toyota – Nissan (Random price between 20000 and 40000)
        BMW-Mercedes(Random price between 50000 and 80000)
        Porsche - Ferrari (Random price between 100000 and 150000)
        */

        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        System.out.println("  Hoşgeldiniz !");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + "." + cars[i]);

        }
        Scanner input = new Scanner(System.in);
        int choice ;

        do {


            System.out.println("Araba seçin : ");
            choice = input.nextInt();
            switch (choice) {
                case 1, 2, 3 -> {
                    int range = (40000 - 20000) + 1;
                    double price = Math.round(20000 + (Math.random() * range));
                    System.out.printf("İstediğiniz araba :%s , %5.2f TL.", cars[choice - 1], price);
                }


                case 4, 5 -> {
                    int range = (80000 - 50000) + 1;
                    double price = Math.round(50000 + (Math.random() * range));
                    System.out.printf("İstediğiniz araba :%s , %5.2f TL.", cars[choice - 1], price);
                }

                case 6,7 -> {
                    int range = (1500000 - 100000) + 1;
                    double price = Math.round(100000 + (Math.random() * range));
                    System.out.printf("İstediğiniz araba :%s , %5.2f TL.", cars[choice - 1], price);
                }default -> System.out.println("yanlış seçim yaptınız tekrar deneyiz");

            }
            }
            while (choice > 7) ;
        }
    }
