package repositories;

import entities.Klient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlientRepo extends CrudRepository <Klient, Long>{
    Klient getById(Long Id);
}
