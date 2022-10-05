package dataAccess;

import entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product) {
        System.out.println("JDBC ile veritabanına eklendi : " + product.getName());
    }
}
// Sadece ve sadece db erişim kodları buraya yazılacak.