package Creational.AbstractFactory;

public class LinuxGUIFactory extends GUIFactory{
    @Override
    public GUI getGUI() {
        return new LinuxGUI();
    }
}
