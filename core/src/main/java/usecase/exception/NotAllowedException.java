package usecase.exception;

public class NotAllowedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NotAllowedException(String msg) {
        super(msg);
    }
}
