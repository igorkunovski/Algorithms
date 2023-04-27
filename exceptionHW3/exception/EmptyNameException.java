package exception;

public class EmptyNameException extends PersonBuilderException{

    private static final String msg = "This field can not be empty!";

    public EmptyNameException() {
        super(msg);
    }
}
