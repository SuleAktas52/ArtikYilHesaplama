import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        /*
        Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl.
        Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.
        Genel bir kural olarak; artık yıllar 4 rakamının katı olan yıllardır.
        100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır.
         */

        int year;
        boolean leapYear= false;

        Scanner input = new Scanner(System.in);
        System.out.print("Yil Giriniz: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    leapYear = true;
                }else{
                    leapYear = false;
                }
            }else {
                leapYear = true;
            }
        } else{
            leapYear = false;
        }

        if (leapYear){
            System.out.println(year + " Artik yildir !");
        }else{
            System.out.println(year + " Artik yil degildir !");
        }

    }
}
