package Model;

import java.util.Objects;

public class Class {
    private int classID;
    private String classname;

    public Class(int classID, String classname) {
        this.classID = classID;
        this.classname = classname;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return classID == aClass.classID &&
                Objects.equals(classname, aClass.classname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classID, classname);
    }

    @Override
    public String toString() {
        return "Class{" +
                "classID=" + classID +
                ", classname='" + classname + '\'' +
                '}';
    }
}
