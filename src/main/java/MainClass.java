import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        CourseRegistration course = new CourseRegistration();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        course.addCourse("java");
        course.addCourse("python");
        course.addCourse("react");

        while (!exit) {
            System.out.println("\n choose the option for registration");
            System.out.println("1 add student for registration");
            System.out.println("2 enroll student for the course ");
            System.out.println("3. display student for a course");
            System.out.println("4. display course for a student");
            System.out.println("5. exiit");
            System.out.print("enter your choice ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("enter the student id: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("enter student name ");
                    String name = sc.nextLine();
                    course.addStudent(studentId, name);
                    System.out.println("Student added successfully in the system");
                    break;

                case 2:
                    System.out.print("enter student id: ");
                    studentId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("enter course code: ");
                    String courseCode = sc.nextLine();
                    course.enrollStudentInCourse(studentId, courseCode);
                    break;

                case 3:
                    System.out.print("enter course code ");
                    courseCode = sc.next();
                    course.displayStudentsForCourse(courseCode);
                    break;

                case 4:
                    System.out.print("enter student id: ");
                    studentId = sc.nextInt();
                    course.displayCoursesForStudent(studentId);
                    break;

                case 5:
                    exit = true;
                    System.out.println("exit");
                    break;

                default:
                    System.out.println("wreong choice by the user");
            }
        }
        sc.close();
    }
}
