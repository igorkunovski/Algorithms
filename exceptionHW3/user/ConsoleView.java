package user;

public class ConsoleView {
    public static void showMainMenu(){
        System.out.println("----MENU----");
        System.out.println(" Please choose number of command and press Enter");
        System.out.println(" 1. Add new Contact");
        System.out.println(" 9. Quit program");
        System.out.println(" ---------------");
    }

    public static void exitFromProgram(){
        System.out.println("----BUY----");
    }

    public static void firstname(){
        System.out.println("Insert Firstname");
    }
    public static void lastname(){
        System.out.println("Insert Lastname");
    }

    public static void patronymic(){
        System.out.println("Insert Patronymic name");
    }

    public static void birth(){
        System.out.println("Insert birth date in format dd.mm.yyyy");
    }

    public static void phone(){
        System.out.println("Insert phone number (only numbers)");
    }

    public static void gender(){
        System.out.println("Insert gender (f- female or m - male)");
    }

    public static void personAdded(){
        System.out.println("Person is added");
    }

}
