package Model;

import java.util.Objects;

public class Teacher {
    private int teacherID;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public Teacher(int teacherID, String firstName, String lastName, int age, String gender) {
        this.teacherID = teacherID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Teacher() {
        super();
    }

    // Getters and setters
    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // equals() & hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return teacherID == teacher.teacherID &&
                age == teacher.age &&
                Objects.equals(firstName, teacher.firstName) &&
                Objects.equals(lastName, teacher.lastName) &&
                Objects.equals(gender, teacher.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherID, firstName, lastName, age, gender);
    }

    // toString() method
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
