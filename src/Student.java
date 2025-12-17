public class Student {
    private int id;
    private String name;
    private int grade; // Stores the grade for the current course

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.grade = -1; // -1 indicates no grade assigned yet
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void setGrade(int grade) { this.grade = grade; }
    public int getGrade() { return grade; }

    @Override
    public String toString() {
        String gradeStr = (grade == -1) ? "N/A" : String.valueOf(grade);
        return "ID: " + id + " | Name: " + name + " | Grade: " + gradeStr;
    }
}