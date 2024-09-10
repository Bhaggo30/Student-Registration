import java.util.HashSet;
public class CourseRegistration {
    private HashSet<Student> students;
    private HashSet<String>  Courses;

    public CourseRegistration() {
        students = new HashSet<>();
        Courses = new HashSet<>();
    }

    public void addCourse(String courseCode){
        Courses.add(courseCode);
    }

    public void addStudent(int studentId, String name) {
        students.add(new Student(studentId, name));
    }

    public void enrollStudentInCourse(int studentId, String courseCode) {
        try {
            if (!Courses.contains(courseCode)) {
                throw new Exception("Course not available!");
            }
            for (Student student : students) {
                if (student.getStudentId() == studentId) {
                    student.enrollInCourse(courseCode);
                    System.out.println("Student " + student.getName() + " enrolled in course: " + courseCode);
                    return;
                }
            }
            throw new Exception("Student not found in this id ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void displayStudentsForCourse(String courseCode) {
        System.out.println("Students registered for course: " + courseCode);
        for (Student student : students) {
            if (student.getCourses().contains(courseCode)) {
                System.out.println(student.getName());
            }
        }
    }
    public void displayCoursesForStudent(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                System.out.println("Courses for student " + student.getName() + ": " + student.getCourses());
                return;
            }
        }
        System.out.println("Student not found in this id ");
    }

}
