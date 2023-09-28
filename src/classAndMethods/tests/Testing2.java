package classAndMethods.tests;

import java.util.Objects;

public class Testing2 {
    public Boolean validator(String requestA) {
        if (Objects.isNull(requestA)) {
            return Boolean.FALSE;
        }

        return requestA.equalsIgnoreCase("qualquerCoisa");
    }
}
