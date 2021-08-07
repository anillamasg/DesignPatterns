package Creational.AbstractFactory2;

public class ClassicFurniture implements Furniture{
    @Override
    public Chair getChair() {
        return new ClassicChair();
    }

    @Override
    public Table getTable() {
        return new ClassicTable();
    }

    @Override
    public Sofa getSofa() {
        return new ClassicSofa();
    }
}
