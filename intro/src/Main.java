public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String ortaMetin = "İlginizi Çekebilir";
        String altMetin = "Vade Süresi";
        System.out.println(ortaMetin);
        // integer veri tipi sayısal değerler tutar
        int vade = 12;

        // double veri tipi ondalıklı sayısal değerler tutar
        double dolarDun = 18.20;
        double dolarBugun = 18.30;

        // boolean veri tipi true veya false değerler tutar
        boolean dolarDustuMu = false;
        String okYonu = "";
        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        }else if(dolarBugun > dolarDun){
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        // Array veri tipi birden fazla veriyi tutar
        String[] krediler = {"Hızlı Kredi","Maaşını Halkban'tan Alanlar","Mutlu Emekli"};
        System.out.println(krediler[0]); // Arraylerde ilk eleman 0'dan başlar. Kodlamada saymaya 0'dan başlar.
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);
        System.out.println("-----------------------------------");
        // for döngüsü
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }

        System.out.println("-----------------------------------");
    }

}

/*
* Java da Main kodu çalıştırmak için gerekli metottur.
* Java da her satırın sonuna noktalı virgül (;) konulur.
* System.out.println(); kodu ekrana yazdırma işlemi yapar.
* // Tekli yorum satırı
* Değişken tanımlamak için değişkenin tipi ve değişkenin adı yazılır.
Değişkenin tipi String, int, double, float, boolean, char, long, short, byte olabilir.
DeğişkenTipi değişkenAdı = değer;
* if (koşul) {
    // Koşul sağlandığında çalışacak kodlar
}else if(koşul2){
    // Koşul2 sağlandığında çalışacak kodlar
} else {
    // Koşul sağlanmadığında çalışacak kodlar
}

* For Döngüsü
* for(başlangıç; koşul; artış) {
    // Koşul sağlandığı sürece çalışacak kodlar
}
*  */