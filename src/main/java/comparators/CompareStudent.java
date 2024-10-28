package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(List.of(
                new Student(22, "Ivan", 7.8),
                new Student(25, "Jone", 9.8),
                new Student(19, "Rosa", 5.7),
                new Student(33, "Ivan", 9.8),
                new Student(22, "Igor", 6.1),
                new Student(19, "Rosa", 5.7),
                new Student(33, "Key", 9.8)
        ));
        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println(studentList);
    }
}
