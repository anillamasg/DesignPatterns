package Creational;

import Creational.Prototype.Movie;
import Creational.Prototype.Theatre;

public class CreationalMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Movie movie = new Movie();
        Movie movie1 = (Movie) movie.clone();

        System.out.println(movie);
        System.out.println(movie1);

        movie.setName("Dreams");
        movie.setReleaseDay("Friday");
        movie.setDirectorName("Bhuwan KC");
        movie.setTheatre(new Theatre("FCUBE"));

        movie1 = (Movie) movie.clone();
        movie1.setName("Gajalu");
        movie1.setDirectorName("Hem Raj BC");
        movie1.getTheatre().setLocation("QFX");

        System.out.println(movie);
        System.out.println(movie1);
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

////////////////////////////        BUILDER DESIGN PATTERN          ///////////////////////////////////////////
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

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */