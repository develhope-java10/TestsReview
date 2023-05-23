package co.develhope.java10.TestsReview;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
	private StudentService service;
	
	public StudentController(StudentService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Student> getAllStudents() {
		return service.retrieveAll();
	}
	
	@GetMapping("/marks")
	public ResponseEntity<AverageMarksDTO> getMarksStats() {
		try {
			return ResponseEntity.ok(new AverageMarksDTO(service.getAverageMarks()));
		} catch (AverageMarksException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PostMapping
	public Student insertNewStudent(@RequestBody Student student) {
		return service.insert(student);
	}
}
