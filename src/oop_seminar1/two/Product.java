package oop_seminar1.two;
/*
Абстрактный класс - это класс, который не может быть инстанциирован (т.е., не может быть создан объект этого класса),
и он может содержать абстрактные методы. Абстрактные методы - это методы, которые объявлены,
но не имеют реализации в абстрактном классе. Вместо этого, они должны быть реализованы в производных классах.

Абстрактные классы используются для создания общей структуры и интерфейса для классов, которые наследуются от них.
класс Product может служить базовым классом для конкретных видов продуктов, предоставляя общие поля и методы,
которые будут унаследованы и, возможно, переопределены в производных классах.
 */
public abstract class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getCost() {

        return cost;
    }

    public void setCost(double cost) {

        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}


