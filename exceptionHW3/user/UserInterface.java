package user;

import config.SupportMethods;
import data.SavePerson;
import exception.PersonBuilderException;
import person.Person;
import person.PersonBuilder;

public class UserInterface {

    SupportMethods sm = new SupportMethods();

    public void run(){
        int cmd = -1;

        while (!(cmd == 9)){
            ConsoleView.showMainMenu();
            cmd = sm.chooseNumber();

            if (cmd == 1){
                try {

                    Person newPerson = new PersonBuilder().buildPerson();
                    new SavePerson().save(newPerson);
                    ConsoleView.personAdded();

                } catch (PersonBuilderException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        ConsoleView.exitFromProgram();
    }
}
