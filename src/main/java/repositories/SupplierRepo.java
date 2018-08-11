package repositories;

import entities.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepo extends CrudRepository<Supplier, Long> {
     Supplier getById(Long Id);
}
