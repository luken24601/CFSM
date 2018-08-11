package repositories;

import entities.Folia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoliaRepo extends CrudRepository<Folia, Long> {
    Folia getById(Long Id);
}
