package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.embed.FullAddress;

@Entity
public class Teacher {
    @Id
    private int id;
    private String name;
    private FullAddress fullAddress;


    public Teacher(){}

    public Teacher(int id, String name, FullAddress fullAddress) {
        this.id = id;
        this.name = name;
        this.fullAddress = fullAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FullAddress getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(FullAddress fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullAddress=" + fullAddress +
                '}';
    }
}
