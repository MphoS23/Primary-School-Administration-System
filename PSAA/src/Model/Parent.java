package Model;

import java.util.Objects;

public class Parent {
    private String firstname, lastname, gender, postalAddress, physicalAddress;
    private int age, firstnameID;

    public Parent(String firstname, String lastname, String gender, int age, int firstnameID, String postalAddress, String physicalAddress) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.firstnameID = firstnameID;
        this.postalAddress = postalAddress;
        this.physicalAddress = physicalAddress;
    }

    public Parent() {
        super();
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

    public int getFirstnameID() {
        return firstnameID;
    }

    public void setFirstnameID(int firstnameID) {
        this.firstnameID = firstnameID;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return age == parent.age &&
                firstnameID == parent.firstnameID &&
                Objects.equals(firstname, parent.firstname) &&
                Objects.equals(lastname, parent.lastname) &&
                Objects.equals(gender, parent.gender) &&
                Objects.equals(postalAddress, parent.postalAddress) &&
                Objects.equals(physicalAddress, parent.physicalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, gender, postalAddress, physicalAddress, age, firstnameID);
    }

    @Override
    public String toString() {
        return "Parent{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                ", physicalAddress='" + physicalAddress + '\'' +
                ", age=" + age +
                ", firstnameID=" + firstnameID +
                '}';
    }
}
