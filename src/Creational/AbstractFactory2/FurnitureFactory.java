package Creational.AbstractFactory2;

public abstract class FurnitureFactory {
    public abstract Furniture getFurniture();

    public static FurnitureFactory getFurnitureFactory (String type) throws Exception{
        return (FurnitureFactory) Class.forName("Creational.AbstractFactory2."+type+"FurnitureFactory").getDeclaredConstructor().newInstance();
    }
}
