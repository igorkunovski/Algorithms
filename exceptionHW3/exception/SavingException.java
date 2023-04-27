package exception;

public class SavingException extends PersonBuilderException{

    private static final String msg = "Something went wrong with Person saving. Please check location";

    public SavingException(String message) {
        super(message);
        System.err.println(msg);
    }
}
