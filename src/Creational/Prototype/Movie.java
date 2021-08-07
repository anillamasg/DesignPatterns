package Creational.Prototype;

public class Movie implements Clonable{
    private String name;
    private String releaseDay;
    private String directorName;
    private Theatre theatre;

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDay(String releaseDay) {
        this.releaseDay = releaseDay;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    @Override
    public Clonable clone() throws CloneNotSupportedException{
        Movie m = (Movie) super.clone();
        m.setTheatre((m.getTheatre()!=null)?m.getTheatre().clone():null);
        return m;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseDay='" + releaseDay + '\'' +
                ", directorName='" + directorName + '\'' +
                ", theatre='" + ((theatre!=null)?theatre.getLocation():"") + '\'' +
                ", hashcode='" + hashCode() + '\'' +
                '}';
    }
}