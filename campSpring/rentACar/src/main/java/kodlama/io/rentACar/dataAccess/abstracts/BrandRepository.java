package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}


/**
 * Data Access katmanı, veritabanı ile ilgili işlemleri yapar.
 * Abstracts klasörü altında interface oluştururuz.
 * Repository ile veritabanı ile ilgili işlemleri yaparız.
 * Dao ile Repository arasında bir fark yoktur.
 */