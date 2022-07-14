package internship.task001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task1Test {

    @DisplayName("filterList test 01")
    @Test
    //создаем тест и выбрасываем исключение
    void test01() throws IllegalArgumentException {
        //создаем утверждение равенства
        Assertions.assertEquals(
                //передаем ожидаемый возврат метода
                List.of(1, 2),
                //передаем метод с тестовыми аргументами
                Task1.filterList(List.of(1, 2, "a", "b"))
        );
    }
    @DisplayName("filterList test 02")
    @Test
    //создаем тест и выбрасываем исключение
    void test02() throws IllegalArgumentException {
        //создаем утверждение равенства
        Assertions.assertEquals(
                //передаем ожидаемый возврат метода
                List.of(1, 2, 0, 15),
                //передаем метод с тестовыми аргументами
                Task1.filterList(List.of(1, 2, "a", "b", 0, 15))
        );
    }
    @DisplayName("filterList test 03")
    @Test
    //создаем тест и выбрасываем исключение
    void test03() throws IllegalArgumentException {
        //создаем утверждение равенства
        Assertions.assertEquals(
                //передаем ожидаемый возврат метода
                List.of(1, 2, 231),
                //передаем метод с тестовыми аргументами
                Task1.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231))
        );
    }
    @DisplayName("filterList test 04")
    @Test
    //создаем тест
    void test04() {
        //создаем утверждение того что лямбда выражение выбросит исключение
        Assertions.assertThrows(
                //передаем ожидаемое исключение
                IllegalArgumentException.class,
                //передаем лямбда выражение
                () -> Task1.filterList(List.of("a", 1, -1))
        );
    }

}
