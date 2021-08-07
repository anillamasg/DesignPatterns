package Creational;

import Creational.AbstractFactory2.Furniture;
import Creational.AbstractFactory2.FurnitureFactory;
import Creational.Builder.Builder;
import Creational.Builder.Car;
import Creational.Builder.CarManual;
import Creational.Builder.Director;

public class CreationalMain {
    public static void main(String[] args){
        Car.CarBuilder builder = new Car.CarBuilder();
        Director director = new Director(builder);
        builder = (Car.CarBuilder) director.constructSports();
        System.out.println(builder.getProduct().toString());
        builder = (Car.CarBuilder) director.constructSUV();
        System.out.println(builder.getProduct().toString());
        System.out.println();

        CarManual.CarManualBuilder carManualBuilder = new CarManual.CarManualBuilder();
        director.setBuilder(carManualBuilder);
        director.constructSports();
        System.out.println(carManualBuilder.getProduct().toString());
        director.constructSUV();
        System.out.println(carManualBuilder.getProduct().toString());

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


        String type = "Classic";
        Furniture furniture = FurnitureFactory.getFurnitureFactory(type).getFurniture();
        furniture.getChair().sitOne();
        furniture.getTable().sitTwo();
        furniture.getSofa().sitFive();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */