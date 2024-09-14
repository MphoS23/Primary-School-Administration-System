package Model;

import java.util.Objects;
//Student class is responsible for holding the various attributes for student entity whenever the student entity is used.
public class Student {
    //attributes
    private int studentID;
    private String birthCno, firstname, lastname, gender;
    private int  age;
   //constructors
    public Student(int studentID, String birthCno, String firstname, String lastname, String gender, int age) {
        this.studentID = studentID;
        this.birthCno = birthCno;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
    }

    public Student() {
        super();
    }

    // Getters and setters
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getBirthCno() {
        return birthCno;
    }

    public void setBirthCno(String birthCno) {
        this.birthCno = birthCno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // equals() & hashCodes()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                studentID == student.studentID &&
                Objects.equals(birthCno, student.birthCno) &&
                Objects.equals(firstname, student.firstname) &&
                Objects.equals(lastname, student.lastname) &&
                Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, birthCno, firstname, lastname, gender, age);
    }

    // toString() methods
    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", birthCno='" + birthCno + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
