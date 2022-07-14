package internship.task001;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
                                                                    //выбрасываем исключение
    public static List<Object> filterList(final List<Object> list) throws IllegalArgumentException {
        //создаем List для сохранения и конвертируем принемаемый list в stream
        List<Object> responseList = list.stream()
                //фильтруем, оставляем только Integer типы
                .filter(x -> x instanceof Integer)
                //обратно конвертируем stream в List
                .collect(Collectors.toList());

        //проверка на наличие отрицательных чисел
        if (responseList.stream().anyMatch(x -> (int) x < 0)) {
            //при наличии отрицательных чисел выбрасываем исключение
            throw new IllegalArgumentException("stream contains negative integer");
        }
        //возвращаем отфильтрованный List
        return responseList;
    }
}
