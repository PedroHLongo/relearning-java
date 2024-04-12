package errorHandling.custom;

import java.io.Serializable;

public class EmptyStringException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1529273282547677440L;

    private final String attributeName;

    public EmptyStringException(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("The attribute '%s' is empty.", this.attributeName);
    }
}
