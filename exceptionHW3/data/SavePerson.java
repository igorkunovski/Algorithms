package data;

import exception.SavingException;
import person.Person;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SavePerson {

    public void save(Person person) throws SavingException{
        File file = new File(getPath(person));
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(String.format("<%s><%s><%s><%s><%d><%s>\n",
                    person.getLastname(), person.getFirstName(), person.getPatronymic(),
                    person.getBirthDate(), person.getPhone(), person.getGender()));
            fw.flush();
        } catch (IOException e) {
            throw new SavingException(e.getMessage());
        }
    }

    private String getPath(Person person) {
        return (new Config(person.getLastname())).getPathCSV();
    }
}
