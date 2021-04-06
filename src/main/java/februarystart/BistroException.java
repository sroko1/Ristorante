package februarystart;

public class BistroException extends Exception{

    private final String message;

    public BistroException(String message) {

        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
