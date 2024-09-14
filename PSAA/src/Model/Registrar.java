package Model;

import java.util.Objects;

public class Registrar {
    public String email, firstname, lastname, gender;
    int registrarID;

    // Constructor
    public Registrar(String email, String firstname, String lastname, String gender, int registrarID){
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.registrarID = registrarID;
    }

    public Registrar(){
        super();
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public int getRegistrarID() {
        return registrarID;
    }

    public void setRegistrarID(int registrarID) {
        this.registrarID = registrarID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registrar registrar = (Registrar) o;
        return registrarID == registrar.registrarID &&
                Objects.equals(email, registrar.email) &&
                Objects.equals(firstname, registrar.firstname) &&
                Objects.equals(lastname, registrar.lastname) &&
                Objects.equals(gender, registrar.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, firstname, lastname, gender, registrarID);
    }

    @Override
    public String toString() {
        return "Registrar{" +
                "email='" + email + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", registrarID=" + registrarID +
                '}';
    }
}
