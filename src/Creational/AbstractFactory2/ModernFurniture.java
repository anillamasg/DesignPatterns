package Creational.AbstractFactory2;

public class ModernFurniture implements Furniture{
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Table getTable() {
        return new ModernTable();
    }

    @Override
    public Sofa getSofa() {
        return new ModernSofa();
    }
}
