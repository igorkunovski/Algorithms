package exception;

public class BirthDateException extends PersonBuilderException{
    private static final String msg = "Incorrect birth date! Please check format or day/month number";

    public BirthDateException() {
        super(msg);
    }
}
