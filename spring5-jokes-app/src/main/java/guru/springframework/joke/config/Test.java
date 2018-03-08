package guru.springframework.joke.config;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {

    }

    public static String PrintFizzBuzz(int input) {
        Function<Integer, Boolean> isMultipleOf3 = isMultipleOf(3);
        Function<Integer, Boolean> isMultipleOf5 = isMultipleOf(5);


        return String.valueOf(input);
    }

    private static Function<Integer, Boolean> isMultipleOf(int multiple) {
        return inputInt -> inputInt % multiple == 0;
    }

}
