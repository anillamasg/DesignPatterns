package Creational.AbstractFactory;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println(this.getClass().getSimpleName()+" clicked!! Its the best.");
    }
}
