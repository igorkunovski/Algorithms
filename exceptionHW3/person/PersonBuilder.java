package person;

import config.SupportMethods;
import exception.PersonBuilderException;
import user.ConsoleView;

public class PersonBuilder {

    SupportMethods sm = new SupportMethods();

    public Person buildPerson() throws PersonBuilderException {

        String firstName, lastname, patronymic,birthDate;
        char gender;
        long phone;

        ConsoleView.firstname();
        firstName = sm.getString();
        sm.checkForEmpty(firstName);
        sm.checkForDigits(firstName);

        ConsoleView.lastname();
        lastname = sm.getString();
        sm.checkForEmpty(lastname);
        sm.checkForDigits(lastname);

        ConsoleView.patronymic();
        patronymic = sm.getString();
        sm.checkForEmpty(patronymic);
        sm.checkForDigits(patronymic);

        ConsoleView.birth();
        birthDate = sm.birth();

        ConsoleView.phone();
        phone = sm.chooseNumber();

        ConsoleView.gender();
        gender = sm.getChar();

        return new Person(firstName, lastname, patronymic, birthDate, gender, phone);
    }
}
