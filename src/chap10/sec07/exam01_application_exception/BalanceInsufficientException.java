package chap10.sec07.exam01_application_exception;

public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException() {
    }

    public BalanceInsufficientException(String message) {
        super(message);
    }
}
