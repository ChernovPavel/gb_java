package lesson_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static lesson_14.Task8.shiftArray;

class Task8Test {

    @DisplayName("Тест смещения")
    @ParameterizedTest
    @MethodSource("data")
    void testShift(int[] arrNew, int[] arr, int n) {
        Assertions.assertArrayEquals(arrNew, shiftArray(arr, n));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}, 0),
                Arguments.arguments(new int[]{5, 1, 2, 3, 4}, new int[]{1, 2, 3, 4, 5}, 1),
                Arguments.arguments(new int[]{4, 5, 1, 2, 3}, new int[]{1, 2, 3, 4, 5}, 2),
                Arguments.arguments(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}, 5),
                Arguments.arguments(new int[]{2, 3, 4, 5, 1}, new int[]{1, 2, 3, 4, 5}, -6)
        );
    }

}