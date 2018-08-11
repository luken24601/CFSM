package repositories;

import entities.Magazyn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagazynRepo extends CrudRepository<Magazyn, Long> {
    Magazyn getById(Long Id);
}
