public class Toys
{
    int id; // Уникальный идентификатор игрушки
    String name; // Название игрушки
    double weight; // Вес игрушки

    // Конструктор класса Toys, который инициализирует поля объекта
    public Toys (int id, String name, double weight)
    {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    // Метод для установки значения веса игрушки
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    // Метод для получения значения веса игрушки
    public double getWeight()
    {
        return weight;
    }
}