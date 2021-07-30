package Creational.AbstractFactory;

public class WindowsGUIFactory extends GUIFactory{
    @Override
    public GUI getGUI() {
        return new WindowsGUI();
    }
}
