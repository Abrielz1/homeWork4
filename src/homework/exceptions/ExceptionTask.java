package homework.exceptions;

import java.util.Optional;

public class ExceptionTask {

    public static Optional<String> mergeStrings(String first, String second) {

        if (first== null && second == null) {
            return Optional.empty();
        }

        if (((first!= null && first.isBlank())&& second.isBlank())) { //
            return Optional.empty();
        }

        first = Optional.ofNullable(first).orElse("");
        second = Optional.ofNullable(second).orElse("");
        return Optional.of( first.length() > second.length() ?first + second : second + first);
    }

    public static long getPower(int n, int p) throws Exception {
        if (n <= 0 || p <= 0) {

            return -1L;
        }

        return (long) (Math.pow(n, p));
    }

    public static void exceptionProcessing() throws Exception {
        try {
            throwCheckedException();
            throwUncheckedException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void customException(int a) throws InstantiationException {
        if (a == 0) {
            throw new InvalidZeroParameterException();
        }

    }

    private static void throwCheckedException() throws Exception {
        throw new Exception("Checked exception");
    }

    private static void throwUncheckedException() {
        throw new RuntimeException("Unchecked exception");
    }
}
