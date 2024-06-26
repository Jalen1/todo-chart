package JalenWu.todochart.taskPackage;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * TaskRepository
 * 
 * Interface for the TaskRepository class.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

    @Query("SELECT t FROM Task t WHERE t.id =?1")
    Optional<Task> findById(Long id);

}
