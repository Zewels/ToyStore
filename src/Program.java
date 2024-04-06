import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program
{
    public static void main(String[] args)
    {
        // Создание нескольких объектов класса Toys
        Toys toy1 = new Toys(0, "вертолет", 15);
        Toys toy2 = new Toys(1, "конструктор", 30);
        Toys toy3 = new Toys(2, "мягкая игрушка", 53);
        Toys toy4 = new Toys(3, "телефон", 20);
        Toys toy5 = new Toys(4, "кукла", 32);
        Toys toy6 = new Toys(5, "робот", 40);

        // Создание списка, в который добавляются объекты игрушек
        List<Toys> toys = new ArrayList<Toys>();

        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);
        toys.add(toy6);

        // Создание объекта класса StoreofToys, который хранит список игрушек
        StoreofToys storeofToys = new StoreofToys(toys);

        // Выбор игрушек для лотереи и их вывод
        storeofToys.ToysToLottery();
        storeofToys.ToysToLottery();
        storeofToys.ToysToLottery();
        storeofToys.ToysToLottery();
        storeofToys.ToysToLottery();
        storeofToys.ToysToLottery();
    }
}
