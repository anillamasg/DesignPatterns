package Creational.AbstractFactory;

public abstract class GUIFactory {
    public abstract GUI getGUI();

    public static GUIFactory getGUIFactory(String type) throws Exception{
        return (GUIFactory) Class.forName("Creational.AbstractFactory."+type+"GUIFactory").getDeclaredConstructor().newInstance();
    }
}
