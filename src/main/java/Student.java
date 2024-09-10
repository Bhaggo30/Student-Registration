import java.util.HashSet;

class Student {
    private int studentId;
    private String name;
    private HashSet<String> courses;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new HashSet<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public HashSet<String> getCourses() {
        return courses;
    }

    public void enrollInCourse(String courseCode) throws Exception {
        if (courseCode == null || courseCode.isEmpty()) {
            throw new Exception("this course is not avialable ");
        }
        courses.add(courseCode);
    }
}