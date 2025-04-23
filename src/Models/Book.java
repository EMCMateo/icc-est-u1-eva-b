package Models;

public class Book {

    private String name;
    private int anoP;

    public Book(String name, int anoP) {
        this.name = name;
        this.anoP = anoP;
    }

    public String getName() {
        return name;
    }

    public int getAnoPublicacion() {
        return anoP;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setAnoP(int anoP) {
        this.anoP = anoP;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Titulo='" + name + '\'' +
                ", Año De Publicacion=" + anoP +
                '}';
    }
    
}
