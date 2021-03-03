package februarystart;

public class BistroException extends Exception{

    private  String message;

    public BistroException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
