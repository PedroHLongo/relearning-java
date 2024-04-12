package errorHandling.custom;

import java.io.Serializable;

public class NumberOutOfRangeException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1529273282547677440L;

    private final String attributeName;

    public NumberOutOfRangeException(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("The attribute '%s' is out of range.", this.attributeName);
    }
}
