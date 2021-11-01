package Lesson_12;

public class InCorrectSideException extends Exception {
    public InCorrectSideException() {
    }

    public InCorrectSideException(String message) {
        super(message);
    }

    public InCorrectSideException(String message, Throwable cause) {
        super(message, cause);
    }

    public InCorrectSideException(Throwable cause) {
        super(cause);
    }

    public InCorrectSideException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
