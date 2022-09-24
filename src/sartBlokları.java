public class sartBlokları {
        public void main (String[]args) {
            int not = 55;
        /* 50 ve üzeri : geçti
        40-49 : bitinleme
        0-39 : kaldı */

            if (not >= 50) {
                System.out.println("Geçti");
            }
            // || veya anlamı taşır
            else if (not >= 40 && not <= 50) {
                System.out.println("Bütünleme");
            } else {
                System.out.println("kaldı");
            }

   }
}
