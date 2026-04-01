package loose.oose.fis.lab.student.manager.model;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;


    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", meanGrade=" + meanGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return age == student.age && Double.compare(meanGrade, student.meanGrade) == 0 && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, meanGrade);
    }

    //generated getters and setters for all fields

}
