package Creational;

import Creational.AbstractFactory.GUI;
import Creational.AbstractFactory.GUIFactory;
import Creational.Singleton.Singleton;

public class CreationalMain {
    public static void main(String[] args) throws Exception{
        Singleton singleton = Singleton.getSingleton();
    }
}

/*
////////////////////////////        FACTORY DESIGN PATTERN          ////////////////////////////////////////////////////
        String type = "Dog";
        AnimalFactory animalFactory = AnimalFactory.getAnimalFactory(type);
        Animal animal = animalFactory.getAnimal();
        animal.makeSound();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////        ABSTRACT FACTORY DESIGN PATTERN          ///////////////////////////////////////////
        String type = "Linux";
        GUIFactory guiFactory = GUIFactory.getGUIFactory(type);
        GUI gui = guiFactory.getGUI();
        gui.getButton().click();
        gui.getCheckBox().check();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */