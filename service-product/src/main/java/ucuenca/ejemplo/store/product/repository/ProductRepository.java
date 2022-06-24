package ucuenca.ejemplo.store.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ucuenca.ejemplo.store.product.entity.Category;
import ucuenca.ejemplo.store.product.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> { // entidad y el tipo de la llave primaria

    public List<Product> findByCategory(Category category);

}
