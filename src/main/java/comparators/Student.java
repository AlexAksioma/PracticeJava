package comparators;

import java.util.Objects;

public class Student implements Comparable<Student> {
    int age;
    String name;
    double averageGrade;

    public Student(int age, String name, double averageGrade) {
        this.age = age;
        this.name = name;
        this.averageGrade = averageGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(averageGrade, student.averageGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" + age +
                ", " + name +
                ", " + averageGrade +
                '}';
    }

    @Override  //student.compareTo(anotherStudent)  минус если student перед another
    public int compareTo(Student anotherStudent) {
        int result = 0;
        double resultDouble = anotherStudent.averageGrade - this.averageGrade;
        if (resultDouble != 0)
            return (int)Math.round(resultDouble*10);
        else
            result = this.age - anotherStudent.age;

        if (result == 0)
            result = this.name.compareTo(anotherStudent.name);
        return result;
    }
}
