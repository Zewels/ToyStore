import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StoreofToys
{
    // Список игрушек, хранимый в объекте класса
    private List<Toys> toys;

    // Конструктор класса, принимающий список игрушек в качестве параметра
    public StoreofToys(List<Toys> toys)
    {
        this.toys = toys;
    }

    // Метод для выбора случайной игрушки по весу из списка
    public Toys getToysForPrice()
    {
        RandomChooser random = new RandomChooser(); // Создание объекта для выбора случайных элементов
        Toys toy = random.chooseOnWeight(toys); // Выбор игрушки по весу с использованием метода объекта random
        return toy;
    }

    // Метод для добавления выбранной игрушки в файл лотереи
    public void ToysToLottery()
    {
        Toys toy = getToysForPrice(); // Получение случайной игрушки
        String text = toy.toString(); // Преобразование игрушки в строку

        // Запись строки в файл "ResultLottery.txt"
        try(FileWriter writer = new FileWriter("ResultLottery.txt", true)) // Создание объекта FileWriter
        {
            writer.write(text); // Запись строки в файл
            writer.append('\n'); // Добавление перевода строки
            writer.flush(); // Сброс буфера записи
        }

        // Обработка исключения в случае ошибки ввода-вывода
        catch (IOException e)
        {
            System.out.println(e.getMessage()); // Вывод сообщения об ошибке
        }
        toys.remove(toy); // Удаление выбранной игрушки из списка
    }
}
