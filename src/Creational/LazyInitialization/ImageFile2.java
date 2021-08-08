package Creational.LazyInitialization;

// Embracing Lazy Instantiation

public class ImageFile2 {
    private String filename;
    private Image image;

    public ImageFile2(String filename){
        this.filename = filename;
    }

    private void loadImage(String filename){
        image = new Image(filename);
    }

    public Image getImage() {
        if (image==null)
            loadImage(filename);
        return image;
    }
}
