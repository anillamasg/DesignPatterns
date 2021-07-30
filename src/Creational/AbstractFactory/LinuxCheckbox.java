package Creational.AbstractFactory;

public class LinuxCheckbox implements Checkbox{
    @Override
    public void check() {
        System.out.println(this.getClass().getSimpleName()+" nicely checked!!");
    }
}
