package JalenWu.todochart.taskPackage;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



// Maps the api/v1/task path to the TaskController class.
@RestController
@RequestMapping(path = "api/v1/task")
public class TaskController {

	private final TaskService taskService;

	// Instantiates a taskService bean and injects it into the TaskController class.
	@Autowired
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}


	@GetMapping
	public List<Task> getTasks() {
		
		return taskService.getTasks();
	}

	// Adds a new task to the database.
	@PostMapping
	public void addTask(@RequestBody Task task) {
		taskService.addNewTask(task);
	} 

	// Deletes a task from the database.
	@DeleteMapping(path = "{taskId}")
	public void deleteTask(@PathVariable("taskId") Long id) {
		taskService.deleteTask(id);
	} 

	// Updates a task in the database.
	@PutMapping(path = "{taskId}")
	public void updateTask(@PathVariable("taskId")Long id, 
						@RequestParam(required=false) String title, 
						@RequestParam(required=false) String description,
						@RequestParam(required=false) boolean completed,
						@RequestParam(required=false) LocalDate timeDue) {
		taskService.updateTask(id, title, description, completed, timeDue);
	}

}
