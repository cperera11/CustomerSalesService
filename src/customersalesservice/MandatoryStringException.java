
package customersalesservice;


/**
 *
 * @author CPerera
 */
public class MandatoryStringException extends IllegalArgumentException{

    private final static String msg = "method argument is mandatory";
    
    public MandatoryStringException() {
        super(msg);
    }

    public MandatoryStringException(String s) {
        super(msg);
    }

    public MandatoryStringException(String message, Throwable cause) {
        super(message, cause);
    }

    public MandatoryStringException(Throwable cause) {
        super(cause);
    }
    
    
    
}
