package co.develhope.java10.TestsReview;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentMarksProcessorTests {
    static final double EQUAL_DELTA = 1e-5;

    private StudentMarksProcessor marksProcessor;

    @BeforeEach
    void setup() {

        marksProcessor = new StudentMarksProcessor();
    }

    @Test
    void testWithEmptyClassroom() {
        double average = marksProcessor.getClassroomMarks(new ArrayList<>());
        assertEquals(0.0, average, EQUAL_DELTA);
    }

    @Test
    void testWithHighAverage() {
        List<Student> classroom = new ArrayList<>();
        classroom.add(new Student(1, "Mario Rossi", 9.0));
        classroom.add(new Student(1, "Giorgia Bianchi", 8.0));
        classroom.add(new Student(1, "Gigi Neri", 7.5));

        double average = marksProcessor.getClassroomMarks(classroom);
        assertEquals(8.166667, average, EQUAL_DELTA);
    }

    @Test
    void testWithOneNullStudent() {

        List<Student> classroom = new ArrayList<>();
        classroom.add(new Student(1, "Mario Rossi", 9.0));
        classroom.add(null);
        classroom.add(new Student(1, "Gigi Neri", 7.5));

        assertThrows(NullPointerException.class, () -> marksProcessor.getClassroomMarks(classroom));
    }

    @Test
    void testWithOneStudent() {
        List<Student> classroom = new ArrayList<>();
        classroom.add(new Student(1, "Mario Rossi", 9.0));
        double average = marksProcessor.getClassroomMarks(classroom);
        assertEquals(9.0, average);
    }

    @Test
    void oneStudentWithNullName() {
        List<Student> classroom = new ArrayList<>();
        classroom.add(new Student(1, null, 9.0));
        classroom.add(new Student(2, "Mario Rossi", 7.0));

        double average = marksProcessor.getClassroomMarks(classroom);
        assertEquals(8.0, average, EQUAL_DELTA);
    }

}

