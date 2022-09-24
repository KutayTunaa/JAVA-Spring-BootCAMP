public class dersler {
    public static void main(String[] args) {

        //ders9

       /* int sayi1 =24;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayi1;

        if (enBuyuk<sayi2) {
            enBuyuk=sayi2;
        }
        if (enBuyuk<sayi3) {
            enBuyuk=sayi3;
        }
        System.out.println("En büyük sayı :" + enBuyuk); */


        //ders 10 switch
       /* char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Dersi A ile geçtiniz tebrikler...");
                break;
            case 'B':
                System.out.println("Dersi B ile geçtiniz");
                break;
            case 'C':
                System.out.println("Dersi C ile geçtiniz..");
                break;
            case 'D':
                System.out.println("Dersi D ile geçtiniz");
                break;
            case 'F':
                System.out.println("Dersten kaldınız...");
                break;
            default:
                System.out.println("Geçersiz not..."); */

        // FOR while do-while

       /* for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For döngü bitti..");

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("while döngüsü bitti...");

        int j = 1;
        do {
            System.out.println("Loglandı");

            System.out.println(i);
            j+=2;
        } while(j <10);
        System.out.println("do-while döngüsü bitti..."); */


        //ders14

      /*  String ogrenci1 = "kutay";
        String ogrenci2 = "derin";
        String ogrenci3 = "salih";
        String ogrenci4 = "ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("***************************");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "kutay";
        ogrenciler[1] = "derin";
        ogrenciler[2] = "salih";
        ogrenciler[3] = "ahmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("***************************");

        for(String ogrenci:ogrenciler){ //öğrenciler dizisindeki her elemanı gez
            System.out.println(ogrenci);

        } */

        //ReCap demo 2

       /* double[] myList = {1.2, 3.4, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);

        }
        System.out.println("toplam = " + total);
        System.out.println("en büyük : " + max); */

        // çok boyutlu dizilerle çalışmak...

       /* String[][] sehirler = new String[3][3];

        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "bursa";
        sehirler[0][2] = "bilecik";
        sehirler[1][0] = "ankara";
        sehirler[1][1] = "konya";
        sehirler[1][2] = "kayseri";
        sehirler[2][0] = "diyarbakır";
        sehirler[2][1] = "urfa";
        sehirler[2][2] = "antep";

        for (int i = 0; i <= 2; i++) {
            System.out.println("***************");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }*/

        //STRİNGlerle çalışmak....

         //String mesaj = "Bugün hava çok güzel...";

        // System.out.println(mesaj);
        /* System.out.println("eleman sayısı:" + mesaj.length());
        System.out.println("5.eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat("Yaşasın!!"));
        System.out.println(mesaj.startsWith("a"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf('e')); */

        //System.out.println(mesaj.replace(' ',('-')));
       /* String yeniMesaj = mesaj.replace(' ',('-'));
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim()); */

                     //ASALsayıMiniproje:

      /*  int number = 2;
        int remainder = number % 2;
        // System.out.println(remainder);
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("sayı asal değildir...");
            return;
        }


        if (number < 2) {
            System.out.println("Geçersiz sayı girdiniz...");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Sayı asaldır...");
        } else {
            System.out.println("Sayı asal değildir...");
        } */


       /* char harf = 'O';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");
        } */

        //6 -> 1,2,3
        //28->1,2,4,7,14
       /* int number = 5;
        int total = 0;

        for(int i = 1; i<number; i++) {
            if (number % i ==0);
            total = total + i;
        }
        if(total == number) {
            System.out.println("mükemmel sayıdır");
        }
        else {
            System.out.println("mükemmel sayı değildir..");
        } */

        //arkadaş sayılar

       /* int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }

        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 = toplam2 + i;
            }
        }
        if (sayi1 == toplam2 && sayi2 == toplam1){
            System.out.println("bu iki sayı arkadaştır");
        }
        else{
            System.out.println("bu iki sayı arkadaş değildir..");
        } */


       /* int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak){
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("sayı mevcuttur");
        }
        else{
            System.out.println("sayı mevcut değildir");
        } */





        }











    }


