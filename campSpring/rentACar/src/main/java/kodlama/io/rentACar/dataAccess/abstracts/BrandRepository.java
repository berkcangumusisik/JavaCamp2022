package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();
}

/**
 * Data Access katmanı, veritabanı ile ilgili işlemleri yapar.
 * Abstracts klasörü altında interface oluştururuz.
 * Repository ile veritabanı ile ilgili işlemleri yaparız.
 * Dao ile Repository arasında bir fark yoktur.
 */