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

*  */