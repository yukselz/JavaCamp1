public class Main {
    public static void main(String[] args) {

        int sayi1 = 60 ;
        int sayi2 = 489 ;
        int sayi3 = 85 ;

        int enBuyuk = sayi1;

        if (enBuyuk<sayi2){
            enBuyuk = sayi2;
        }

        if (enBuyuk<sayi3){
            enBuyuk = sayi3;
        }
        System.out.println("En Büyük = " + enBuyuk);
    }
}