package day20;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {

        /* Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
           En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.
         */




        Scanner input=new Scanner(System.in);
        int[]newList=new int[10];

        for (int i = 0; i < newList.length; i++) {

            System.out.println((i+ 1 )+ " Sayı giriniz: ");
            newList[i]= input.nextInt();
        }

        int Max=newList[0];
        int Min=newList[0];

        for (int i: newList) {

            if (i<Min){
                i=Min;
            }if (i>Max){
                Max=i;

            }
        }
        System.out.println("En büyük sayı : "+Max);
        System.out.println("En küçük sayı : "+Min);









    }
}
