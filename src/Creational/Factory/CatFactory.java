package Creational.Factory;

public class CatFactory extends AnimalFactory{
    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
