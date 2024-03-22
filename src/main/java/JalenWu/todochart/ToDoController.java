package JalenWu.todochart;

// import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TaskForgeController
 * 
 * Declares Mappings for the TaskForge Application's endpoints.
 */
public class ToDoController { 

	// @GetMapping is equivalent to @RequestMapping(method = RequestMethod.GET).
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

    
}