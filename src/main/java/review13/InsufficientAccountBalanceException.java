package review13;

/***
 * This exception is thrown when user does not have enough balance
 */
public class InsufficientAccountBalanceException extends RuntimeException{
    public InsufficientAccountBalanceException(String msg){
        super(msg);
    }
}


