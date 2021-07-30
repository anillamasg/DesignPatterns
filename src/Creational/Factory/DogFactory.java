package Creational.Factory;

public class DogFactory extends AnimalFactory{
    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}
