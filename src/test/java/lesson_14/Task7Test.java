package lesson_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static lesson_14.Task7.checkBalance;
import static lesson_14.Task7.sum;

class Task7Test {

    @DisplayName("Тест баланса")
    @ParameterizedTest
    @MethodSource("data1")
    void testBalance(boolean bool, int[] arr) {
        Assertions.assertEquals(bool, checkBalance(arr));
    }

    static Stream<Arguments> data1() {
        return Stream.of(
                Arguments.arguments(true, new int[]{2, 2, 2, 1, 2, 2, 0, 0, 10, 1}),
                Arguments.arguments(false, new int[]{3, 5}),
                Arguments.arguments(false, new int[]{2, 2, 0, 0, 3})
        );
    }

    @DisplayName("Тест суммы")
    @ParameterizedTest
    @MethodSource("data2")
    void testSum(int sum, int[] arr) {
        Assertions.assertEquals(sum, sum(arr, 0, arr.length));
    }

    static Stream<Arguments> data2() {
        return Stream.of(
                Arguments.arguments(22, new int[]{2, 2, 2, 1, 2, 2, 0, 0, 10, 1}),
                Arguments.arguments(8, new int[]{3, 5}),
                Arguments.arguments(7, new int[]{2, 2, 0, 0, 3})
        );
    }

}