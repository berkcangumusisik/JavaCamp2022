import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.JdbcProductDao;
import entities.Product;

public class Main {

    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone Xr", 10000);
        Logger[] loggers = {new FileLogger(), new DatabaseLogger(),new MailLogger()};
        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);



    }
}

/**
  * Data Access Layer => DAL Veri Erişim Katmanı => Veritabanı işlemleri
 * Business  Layer => BL İş Katmanı => İş kuralları
 * UI Layer => UI Kullanıcı Arayüzü => Kullanıcıya gösterilen kısım
 *
 */