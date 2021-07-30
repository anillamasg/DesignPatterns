package Creational.Factory;

public abstract class AnimalFactory {
    public abstract Animal getAnimal();

    public static AnimalFactory getAnimalFactory(String type) throws Exception {
        return (AnimalFactory) Class.forName("Creational.Factory."+type+"Factory").getDeclaredConstructor().newInstance();
    }
}
