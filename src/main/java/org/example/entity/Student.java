package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.embed.FullName;

//database eke name eka hadenne entity kiyana annotation eken
//database table eke nama wenas karanna oni nn (name="") entity eka purawatama nama wenas karagannawa  meken nama wenas karana widiha agata gunai
//@Table(name="")mekenuth name eka wenas karanna puluwan (meken table eke nama witharai wenas wenne hibrenet athuladi ganne stusdent kiyalamai)
@Entity
public class Student {
    //primary key eka widihata dena eka aniwaryai naththan wad karan na
    @Id
    private int id;
    private FullName name;
    private String address;

    public Student(int id, FullName name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Student(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", address='" + address + '\'' +
                '}';
    }
}
