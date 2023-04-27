package exception;

public class PersonBuilderException extends RuntimeException{
    private final String message;

    public PersonBuilderException (String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
