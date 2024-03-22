package JalenWu.todochart.taskPackage;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

// The @Service annotation is used to indicate that the class is a service class in the business layer.
@Service
public class TaskService {

	private final TaskRepository taskRepository;

	// The @Autowired annotation is used to inject the TaskRepository dependency.
	@Autowired
	TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	// Retrieves all tasks from the database.
	public List<Task> getTasks() {

		// The findAll() method is used to retrieve all the records from the database.
		return taskRepository.findAll();

		// Task task1 = new Task();
		// Task task2 = new Task("newTask", "This is a test.", LocalDate.now(),
		// LocalDate.MAX);

		// return List.of(task1, task2);
	}

	// Adds a new task to the database.
	public void addNewTask(Task task) {

		// checks if a task with the given id already exists.
		Optional<Task> taskOptional = taskRepository.findById(task.getId());

		// if the task already exists, throw an exception.
		if (taskOptional.isPresent()) {
			throw new IllegalStateException("Task already exists.");
		}

		// save the task to the database.
		taskRepository.save(task);

	}

	public void deleteTask(Long taskId) {

		// true if the task exists, false if it does not.
		boolean exists = taskRepository.existsById(taskId);

		// if the task does not exist, throw an exception.
		if (exists == false) {
			throw new IllegalStateException("Task with id " + taskId + " does not exist.");
		}

		// delete the task with the given id.
		taskRepository.deleteById(taskId);

	}

	// updates a task in the database.
	// The @Transactional annotation executes the actions in the method and commits the changes to the database.
	@Transactional
	public void updateTask(Long taskId, String newTitle, String newDescription, boolean completed, LocalDate newTimeDue) {
		Task taskToUpdate = taskRepository.findById(taskId)
				.orElseThrow(() -> new IllegalStateException("Task with id " + taskId + " does not exist."));

		// if the new title is not null, not empty, and different from the current title, update the task.
		if (newTitle != null && newTitle.length() > 0 && !taskToUpdate.getTitle().equals(newTitle)) {
			taskToUpdate.setTitle(newTitle);
		}

		// if the new description is not null, not empty, and different from the current description, update the task.
		if (newDescription != null && newDescription.length() > 0
				&& !taskToUpdate.getDescription().equals(newDescription)) {
			taskToUpdate.setDescription(newDescription);
		}

		// if the new due date is not different from the current due date, update the task.
		if (newTimeDue != null && !taskToUpdate.getTimeDue().equals(newTimeDue)) {
			taskToUpdate.setTimeDue(newTimeDue);
		}

		// if the completion status is different from the current status, update the task.
		if(taskToUpdate.isCompleted() != completed){
		taskToUpdate.setCompleted(completed);
		}

	}

}
