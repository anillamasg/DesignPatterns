package Creational.AbstractFactory;

public class LinuxButton implements Button{
    @Override
    public void click() {
        System.out.println(this.getClass().getSimpleName()+" clicked!! Only for professionals.");
    }
}
