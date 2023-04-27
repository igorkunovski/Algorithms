package exception;

public class DigitInStringException extends PersonBuilderException{

    private static final String msg = "Must be only letters in name!";

    public DigitInStringException() {
        super(msg);
    }
}
