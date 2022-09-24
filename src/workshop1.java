/* public class workshop1 {
        public static void main(String[] args) {

            int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
            int aranacak = 9;

            boolean varMi = sayiBul(sayilar, aranacak);
            mesajVer(varMi, aranacak);
        }

        public static void mesajVer(boolean varMi, int aranacak) {
            String mesaj = "";
            if (varMi == true) {
                mesaj = "sayı mevcuttur: " + aranacak;
                System.out.println(mesaj);
            } else {
                mesaj="sayı mevcut değildir : " + aranacak;
                System.out.println(mesaj);
            }
        }



        public static boolean sayiBul(int[] sayilar, int aranacak) {

            boolean varMi = false;

            for (int sayi : sayilar) {
                if (sayi == aranacak) {
                    varMi = true;
                    break;
                }
            }
            return varMi;
        }
    }





//bir fonksiyon yaz: bool döndürsün- sayıBul
// iki parametre alsın, P1: dizi P2:3
//3 sayısı dizide vardır yazacak

*/