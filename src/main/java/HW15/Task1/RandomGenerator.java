package HW15.Task1;
    /*
    1. Создали публичный статический возвращаемый метод список List из класса Collection с дженериком,
       который определяет тип хранимого объекта Integer по имени Massive
       (с конструктором для возможности параметризации пользователем, который содержит размер и границы).
    2. Создали объект Random, для генерации случайных чисел;
    3. Создали реализацию ArrayList от List по имени result, эту переменную будем передавать в return метода
    4. Циклом проходимся до того пока размер не достигнет предела указанного Юзером и добавляем с каждой итерацией
       новое рандомное значение.
    5. Переменная result получает доступ к методам List, а random к методам из Объекта Random.
    6. Метод nextInt () класса Random принимает граничное целое число и возвращает случайное значение
       int от 0 (включительно) до указанного предела и сделает это size раз благодаря циклу. А метод add, добавит эти
       элементы в массив. Bound в скобках определяя разницу между границами массива, укажет диапазон для генерации чисел.
       naturalOrder это статический метод Comparator функционального интерфейса - использован для сортировки.
       return - возвращемое значение (метод не Void)
       Далее заполнение конструктора и вызов в Main.
       Что получилось. На сайте можно предоставить услугу генерации коммерческих предложений. Обычная практика -
       это запрос 3 и более КП с рандомным разбросом, можно реализовать для игровых целей, для генерации в карточных играх
       лотереях, тестах.
    */

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.*;

public class RandomGenerator {
    public static List<Integer> Massive(int size, int lowerBound, int upperBound) {
        Random random = new Random();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(upperBound - lowerBound) + lowerBound);
            result.sort(Comparator.naturalOrder());
        }
        return result;
    }

    List<Integer> integerList = Massive(20, -100, 123);
}