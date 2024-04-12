package errorHandling;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        uncheckedException();
        try {
            checkedException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("End");
    }

    // unchecked exception
    static void uncheckedException() {
        throw  new RuntimeException("An error has occurred at #generateErro1");
    }

    // checked - needs exception at the method's signature if not handled
    static void checkedException() throws Exception {
        throw new Exception("An error has occurred at #generateErro2");
    }

    // Doesn't need the signature
    static void checkedException2() {
        try {
            throw new Exception("An error has occurred at #generateErro3");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
