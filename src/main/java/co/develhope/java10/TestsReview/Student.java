package co.develhope.java10.TestsReview;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double averageMarks;

    public Student() {
    }

    public Student(int id, String name, double averageMarks) {
        this.id = id;
        this.name = name;
        this.averageMarks = averageMarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    public void setAverageMarks(double averageMarks) {
        this.averageMarks = averageMarks;
    }
}
