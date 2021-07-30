package Creational.AbstractFactory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void check() {
        System.out.println(this.getClass().getSimpleName()+" checked!!");
    }
}
