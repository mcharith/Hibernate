package org.example.embed;

import jakarta.persistence.Embeddable;

@Embeddable
public class FullName {
    private String firstname;
    private String secondname;

    public FullName(String firstname, String secondname) {
        this.firstname = firstname;
        this.secondname = secondname;
    }

    public FullName() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                '}';
    }
}
