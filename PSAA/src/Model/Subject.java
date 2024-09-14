package Model;

import java.util.Objects;

public class Subject {
    private String subjectname;
    private String subjectcode;

    public Subject(String subjectname, String subjectcode) {
        this.subjectname = subjectname;
        this.subjectcode = subjectcode;
    }

    public Subject() {
        super();
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getSubjectcode() {
        return subjectcode;
    }

    public void setSubjectcode(String subjectcode) {
        this.subjectcode = subjectcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(subjectname, subject.subjectname) &&
                Objects.equals(subjectcode, subject.subjectcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectname, subjectcode);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectname='" + subjectname + '\'' +
                ", subjectcode='" + subjectcode + '\'' +
                '}';
    }
}
