package repositories;

import entities.Auto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepo extends CrudRepository<Auto, Long> {
    Auto getById(Long Id);
}

