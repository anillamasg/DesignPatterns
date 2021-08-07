package Creational.AbstractFactory2;

public class ModernFurnitureFactory extends FurnitureFactory{
    @Override
    public Furniture getFurniture() {
        return new ModernFurniture();
    }
}
