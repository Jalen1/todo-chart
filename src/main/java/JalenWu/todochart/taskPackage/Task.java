package JalenWu.todochart.taskPackage;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;



/**
 * Task
 * To implement the ITask interface.
 */

@Setter
@Getter
@Table(name = "task")
@Entity
public class Task {

    @Id
    @SequenceGenerator(
            name = "task_sequence",
            sequenceName = "task_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = jakarta.persistence.GenerationType.SEQUENCE,
            generator = "task_sequence")

    private Long id;
    private boolean completed;
    private String title;
    private String description;
    private LocalDate timeWritten;
    private LocalDate timeDue;

    /**
     * Core constructor for the Task class.
     * @param id -- the id of the task.
     * @param title -- the name of the task.
     * @param description -- the description of the task.
     * @param timeWritten -- the date the task was created.
     * @param timeDue -- the date the task is due.
     */
    public Task(Long id, String title, String description, LocalDate timeWritten, LocalDate timeDue) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.timeWritten = timeWritten;
        this.timeDue = timeDue;
        this.completed = false;
    }

    /**
     * Core constructor for the Task class.
     * @param title -- the name of the task.
     * @param description -- the description of the task.
     * @param timeWritten -- the date the task was created.
     * @param timeDue -- the date the task is due.
     */
    public Task(String title, String description, LocalDate timeWritten, LocalDate timeDue) {
        this.title = title;
        this.description = description;
        this.timeWritten = timeWritten;
        this.timeDue = timeDue;
        this.completed = false;
    }

    /**
     * Constructor for the Task class when the user does not pass in a due date.
     * @param title --  the name of the task.
     * @param description -- the description of the task.
     * @param timeWritten -- the date the task was created.
     */
    public Task(String title, String description, LocalDate timeWritten) {
        this.title = title;
        this.description = description;
        this.timeWritten = timeWritten;
        this.timeDue = null;
    }

    /**
     * Empty constructor for the Task class.
     */
    public Task() {
        this.title = "";
        this.description = "";
        this.timeWritten = LocalDate.now();
        this.timeDue = null;
        this.completed = false;
    }


    public String toString() {
        return "Title: " + getTitle() + "\nDescription: " + getDescription() + "\nTime Written: " + getTimeWritten()
                + "\nTime Due: " + getTimeDue() + "\nCompleted: " + isCompleted() +"\n";
    }

}
