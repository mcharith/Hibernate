package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session=FactoryConfiguration.getInstance().getSession();

        FullName fullName = new FullName("Charith","Siriwardana");

        Student student = new Student();
        student.setId(1);
        student.setName(fullName);
        student.setAddress("Matale");

        //Save karanna kalin transaction ekak danna oni.
        Transaction transaction=session.beginTransaction();

        session.save(student);

        //eta passe commit karanna oni
        transaction.commit();
        session.close();//session ekak hadpuwama eka close karanna oni.

        //try delete and get.
        //thawa table ekak kohomada methanata genne
        //note eka piliwelata hadanna oni
    }
}