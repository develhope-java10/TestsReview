package co.develhope.java10.TestsReview;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentMarksProcessor {
    public double getClassroomMarks(List<Student> classroomStudents) {
        return classroomStudents.stream()
                    .mapToDouble(Student::getAverageMarks)
                    .average()
                    .orElse(0.0);
    }
}
