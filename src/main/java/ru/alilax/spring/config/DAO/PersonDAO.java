package ru.alilax.spring.config.DAO;

import org.springframework.stereotype.Component;
import ru.alilax.spring.config.models.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

//    private static Connection connection;
//    final static String URL = "jdbc:postgresql://localhost:5432/FinalProjectDB" +
//            "?user=postgres&password=19902115";
//
//    static {
//        try {
//            connection = DriverManager.getConnection(URL);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
    private List<Person> people;
    private int count;
    {
        people = new ArrayList<>();
        people.add(new Person(++count,"Tom","tom@mail.com",25));
        people.add(new Person(++count,"Bob","bob@mail.com",34));
        people.add(new Person(++count,"Mike","mike@mail.com",27));
        people.add(new Person(++count,"Katy","katy@mail.com",19));
        System.out.println(count);

    }
    public List<Person> index(){

        return people;
    }
    public Person show(int id){
        return people.stream()
                .filter(person -> person.getId() == id)
                .findAny().orElse(null);
    }
    public void save(Person person){
        person.setId(++count);
        people.add(person);
    }

    public void update (int id,Person updatedPerson){
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id){
        people.removeIf(person -> person.getId() == id);
    }
}
