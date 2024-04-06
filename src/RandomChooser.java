import java.util.List;

public class RandomChooser
{
    // Метод для выбора случайной игрушки из списка на основе их веса
    public Toys chooseOnWeight(List<Toys> toys)
    {
        // Вычисление общего веса всех игрушек в списке
        double completeWeight = 0.0;
        for (Toys toy: toys)
            completeWeight += toy.getWeight();

        // Генерация случайного числа в диапазоне от 0 до общего веса
        double r = Math.random() * completeWeight;

        // Выбор игрушки, чей вес "перекрывает" сгенерированное случайное число
        double countWeight = 0.0;
        for (Toys toy: toys)
        {
            countWeight+= toy.getWeight();
            if (countWeight >= r)
                return toy; // Возврат выбранной игрушки
        }
        // В случае, если игрушка не была выбрана (например, из-за некорректных данных)
        throw new RuntimeException("Ошибка, но сомневаюсь"); // Генерация исключения с сообщением об ошибке
    }
}
