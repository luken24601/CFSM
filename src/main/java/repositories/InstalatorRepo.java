package repositories;

import entities.Instalator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstalatorRepo extends CrudRepository<Instalator, Long> {
    Instalator getById(Long Id);
}
