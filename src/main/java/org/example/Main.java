package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullAddress;
import org.example.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session=FactoryConfiguration.getInstance().getSession();

        FullAddress fullAddress = new FullAddress("Matale","Naula");
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("Athula");
        teacher.setFullAddress(fullAddress);

        Transaction transaction = session.beginTransaction();
//        save
        session.save(teacher);

//        delete
//        session.delete(teacher);


        Teacher teacher1 = session.get(Teacher.class,1);
        System.out.println(teacher1.toString());

        transaction.commit();
        session.close();

    }
}