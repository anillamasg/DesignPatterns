package Creational;

import Creational.LazyInitialization.College;
import Creational.LazyInitialization.ImageFile2;
import Creational.Multiton.Camera;
import Creational.Multiton.CameraPosition;

public class CreationalMain {
    public static void main(String[] args) {
        Camera cameraFront = Camera.getInstance(CameraPosition.FRONT);
        Camera cameraBack = Camera.getInstance(CameraPosition.BACK);
        Camera cameraLeft = Camera.getInstance(CameraPosition.LEFT);
        Camera cameraRight = Camera.getInstance(CameraPosition.RIGHT);

        Camera cameraNew = Camera.getInstance(CameraPosition.RIGHT);
        System.out.println(cameraNew.toString());

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

////////////////////////////        BUILDER DESIGN PATTERN          ////////////////////////////////////////////////////

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

////////////////////////////        PROTOTYPE DESIGN PATTERN          //////////////////////////////////////////////////

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

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////        LAZY INITIALIZATION DESIGN PATTERN          ////////////////////////////////////////

        ImageFile2 imageFile = new ImageFile2("anil.jpg");
        imageFile.getImage();

        College college = new College("KIST");
        System.out.println(college);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */