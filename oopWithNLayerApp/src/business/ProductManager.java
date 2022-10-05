package business;

import core.logging.Logger;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import dataAccess.ProductDao;
import entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }


    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 10){
            throw new Exception("Ürün fiyatı 10 TL den az olamaz.");
        }
        productDao.add(product);
        for (Logger logger : loggers) {
            logger.log(product.getName() + " ürünü eklendi.");
        }
    }
}
