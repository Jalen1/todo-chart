package JalenWu.todochart.taskPackage;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TaskConfig
 * 
 * Initializes the database with sample tasks.
 * The @Configuration annotation indicates that the class contains bean definitions.
 */
@Configuration
public class TaskConfig { 

    // This method populates the database with tasks by running args in the command line.
    @Bean
    CommandLineRunner commandLineRunner(TaskRepository taskRepository) {
        return args -> {
            Task task1 = new Task("Go to the Gym",
                    "Hit a chest workout.",
                    LocalDate.now(),
                    LocalDate.of(2024, 3, 22));
            taskRepository.save(task1);

            Task task2 = new Task("Do Laundry",
                    "Wash and fold clothes.",
                    LocalDate.now(),
                    LocalDate.of(2024, 3, 25));
            taskRepository.save(task2);

            Task task3 = new Task("Clean Room",
                    "Vacuum and dust the bedroom.",
                    LocalDate.now(),
                    LocalDate.of(2024, 3, 28));
            taskRepository.save(task3);

            Task task4 = new Task("Finish Homework",
                    "Work on the coding assignment.",
                    LocalDate.now(),
                    LocalDate.of(2024, 4, 1));
            taskRepository.save(task4);


        }; 
    }

}
