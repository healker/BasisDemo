package healker.exceptintest;

/**
 * @author healk
 */
public class CustomizeException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public CustomizeException(String message){
        super(message);
    }

    public CustomizeException(Throwable cause)
    {
        super(cause);
    }

    public CustomizeException(String message,Throwable cause)
    {
        super(message,cause);
    }
}
