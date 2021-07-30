package Creational.AbstractFactory;

public class WindowsGUI implements GUI{
    @Override
    public Checkbox getCheckBox() {
        return new WindowsCheckbox();
    }

    @Override
    public Button getButton() {
        return new WindowsButton();
    }
}
