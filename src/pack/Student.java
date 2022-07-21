package pack;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private int course;
    private double avgGrade;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public Student(String name, String surname, int course, double avgGrade) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course + '\'' +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Double.compare(student.avgGrade, avgGrade) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, avgGrade);
    }

    @Override
    public int compareTo(Student o) {
        return (this.course - o.course) + Double.compare(this.avgGrade, o.avgGrade);
    }
}
