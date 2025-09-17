import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> offerings = new ArrayList<>();

    public void add(T courseType) { offerings.add(courseType); }
    public List<T> list() { return offerings; }

    public static void displayAny(java.util.List<? extends CourseType> list) {
        for (CourseType c : list) System.out.println(c);
    }
}
