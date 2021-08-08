package Creational.LazyInitialization;

// Not Embracing Lazy Instantiation

public class ImageFile {
    private String filename;
    private Image image;

    public ImageFile(String filename){
        this.filename = filename;
        image = loadImage(filename);
    }

    private Image loadImage(String filename){
        return new Image(filename);
    }

    public Image getImage() {
        return image;
    }
}
