package dataAccess;

import entities.Product;

public interface ProductDao {
    void add(Product product);
}

// Interface'lerin amacı, birbirinin alternatifi olan ama kod içerikleri farklı olan durumlar için kullanılır.
// Örneğin, bir ürünü veritabanına eklemek için, JDBC ile veya Hibernate ile yapılabilir.
// Bu iki durumda da, ürünü veritabanına eklemek için aynı operasyonu kullanacağız.
// Fakat, JDBC ile veya Hibernate ile veritabanına ekleme işlemleri farklıdır.
// Bu durumda, interface kullanarak, aynı operasyonu kullanmamızı sağlayabiliriz.
// implements anahtar kelimesi ile interface'leri implemente edebiliriz.
// Interface'ler, new'lenemezler.
// Interface'ler, içerisinde sadece imza (signature) bulundururlar.