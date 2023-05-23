package co.develhope.java10.TestsReview;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private StudentRepository repository;
	
	private StudentMarksProcessor marksProcessor;
	
	public StudentService(StudentRepository repository, StudentMarksProcessor marksProcessor) {
		this.repository = repository;
		this.marksProcessor = marksProcessor;
	}
	
	public Student insert(Student student) {
		return repository.save(student);
	}
	
	public List<Student> retrieveAll() {
		return repository.findAll();
	}
	
	public double getAverageMarks() throws AverageMarksException {
		return marksProcessor.getClassroomMarks(retrieveAll());
	}
}
