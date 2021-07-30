package Creational.AbstractFactory;

public class LinuxGUI implements GUI{
    @Override
    public Checkbox getCheckBox() {
        return new LinuxCheckbox();
    }

    @Override
    public Button getButton() {
        return new LinuxButton();
    }
}
