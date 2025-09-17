import java.util.Arrays;

public class UniversityDemo {
    public static void main(String[] args) {
        Course<ExamCourse> cs101 = new Course<>();
        cs101.add(new ExamCourse("Algorithms - Exam"));

        Course<AssignmentCourse> cs102 = new Course<>();
        cs102.add(new AssignmentCourse("Project Lab - Assignments"));

        // Wildcard to display any CourseType
        java.util.List<ExamCourse> examList = Arrays.asList(new ExamCourse("Data Structures - Exam"));
        Course.displayAny(examList);

        System.out.println("cs101 size: " + cs101.list().size());
        System.out.println("cs102 size: " + cs102.list().size());
    }
}
