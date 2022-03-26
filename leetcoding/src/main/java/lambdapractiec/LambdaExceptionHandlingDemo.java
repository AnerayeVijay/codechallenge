package lambdapractiec;

import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;

public class LambdaExceptionHandlingDemo {

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        int key = 0;
        process(intArray, key, wrapperException());
    }

    @NotNull
    private static BiConsumer<Integer, Integer> wrapperException() {
        return ( a,  b) -> {
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
            }

        };
    }

    private static void process(int[] intArray, int key, BiConsumer<Integer,Integer> consumer) {
        for(int a: intArray){
            consumer.accept(a,key);
        }
    }

}
