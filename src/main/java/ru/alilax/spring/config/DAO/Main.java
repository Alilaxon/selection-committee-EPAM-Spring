package ru.alilax.spring.config.DAO;

import ru.alilax.spring.config.models.Person;

public class Main {
    public static void main(String[] args) {


        DBmanager dBmanager = new DBmanager();
        Person person = new Person(1,"Yegorka","alilax@gmail.com",32);

        dBmanager.insertUser(person);
    }
}
