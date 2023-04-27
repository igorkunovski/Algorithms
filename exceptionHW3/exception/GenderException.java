package exception;

public class GenderException extends PersonBuilderException{

    private static final String msg = "Incorrect gender. Must be f or m only";

    public GenderException() {
        super(msg);
    }
}
