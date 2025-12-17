import java.util.HashMap;
import java.util.Map;

public class Course {
    private String name;
    private int capacity;
    private Map<Student, Integer> students;

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        students = new HashMap<>();
    }

-    public boolean enroll(Student student) {
        if (students.size() >= capacity) {
            return false;
        }
        students.put(student, null);
        return true;
    }

    public boolean isEnrolled(Student student) {
        return students.containsKey(student);
    }

    public void setGrade(Student student, int grade) {
        students.put(student, grade);
    }

    public Map<Student, Integer> getStudents() {
        return students;
    }
}

