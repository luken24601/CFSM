package repositories;

import entities.Calendar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepo extends CrudRepository<Calendar, Long> {
    Calendar getById(Long Id);
}
