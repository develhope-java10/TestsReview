package co.develhope.java10.TestsReview;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentMarksProcessor {
	public double getClassroomMarks(List<Student> classroomStudents) throws AverageMarksException {
		if (classroomStudents.size() == 0) {
			return 0;
		}
		double sum = 0;
		for (Student s : classroomStudents) {
			if (s == null) {
				throw new NullPointerException("stud is null");
			}
			if (s.getAverageMarks() < 0) {
				throw new AverageMarksException();
			}
			sum += s.getAverageMarks();
		}
		double average = sum / classroomStudents.size();
		return average;
	}
}
