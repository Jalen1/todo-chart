package JalenWu.todochart;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import JalenWu.todochart.taskPackage.Task;

@SpringBootTest
class TodoChartApplicationTests {


	@Test
	void testTaskConstructor1() {
		Task task = new Task();
		task.setId(1L);
		task.setTitle("Test Task");
		task.setDescription("This is a test task.");
		task.setTimeDue(LocalDate.of(2024, 3, 22));
		task.setCompleted(false);

		assert(task.getId() == 1L);
		assert(task.getTitle().equals("Test Task"));
		assert(task.getDescription().equals("This is a test task."));
		assert(task.getTimeDue().equals(LocalDate.of(2024, 3, 22)));
		assert(task.isCompleted() == false);
	}

	@Test
    void testTaskConstructor2() {
        Task task = new Task(
		 "SecondTask",
		  "Second test task.",
		   LocalDate.now(),
		    LocalDate.of(2024, 3, 25));
        
        assert(task.getTitle().equals("SecondTask"));
        assert(task.getDescription().equals("Second test task."));
        assert(task.getTimeDue().equals(LocalDate.of(2024, 3, 25)));
        assert(!task.isCompleted());
    }

	@Test
    void testTaskConstructor3() {
        Task task = new Task(
		 "ThirdTask",
		  "Third test task.",
		   LocalDate.now());
        assert(task.getTitle().equals("ThirdTask"));
        assert(task.getDescription().equals("Third test task."));
		assert(task.getTimeWritten().equals(LocalDate.now()));
        assert(!task.isCompleted());
    }

}
