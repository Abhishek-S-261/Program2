

public class StudentCourses {
    String[] semester1Courses = {"Math", "Physics"};
    int[] semester1Marks = {85, 78};

    String[] semester2Courses = {"Chemistry", "Biology"};
    int[] semester2Marks = {88, 82};

    public void displayCourses() {
        System.out.println("Semester 1 Courses and Marks:");
        for (int i = 0; i < semester1Courses.length; i++) {
            System.out.println(semester1Courses[i] + ": " + semester1Marks[i]);
        }

        System.out.println("Semester 2 Courses and Marks:");
        for (int i = 0; i < semester2Courses.length; i++) {
            System.out.println(semester2Courses[i] + ": " + semester2Marks[i]);
        }
    }

    public static void main(String[] args) {
        StudentCourses courses = new StudentCourses();
        courses.displayCourses();
    }
}
