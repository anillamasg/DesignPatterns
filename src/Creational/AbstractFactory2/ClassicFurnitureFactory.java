package Creational.AbstractFactory2;

public class ClassicFurnitureFactory extends FurnitureFactory{
    @Override
    public Furniture getFurniture() {
        return new ClassicFurniture();
    }
}
