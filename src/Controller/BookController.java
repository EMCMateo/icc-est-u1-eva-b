package Controller;
import Models.Book;
import View.viewConsole;

public class BookController {
    private viewConsole view;
    
    public BookController(viewConsole view){
        view = new viewConsole();
    }
    
    public void sortByInsercionName(Book [] books, String name){
        viewConsole view = new viewConsole();
        for(int i = 1; i < books.length;i++){
            int j = i-1;
            Book aux = books[i];
            while(j>=0 && books[j].getName().compareToIgnoreCase(aux.getName())>0){
                books[j+1] = books[j];
                j--;
            }
            books[j+1] = aux;
        }
        

        searchByName(books, name);
        view.showMessage("Libros ordenados");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
        view.showMessage("Libro con nombre: "+name);
        buscarBookPorNombre(books, name);



    }    

    public int searchByName(Book[] books, String name){
        int inicio = 0;
        int fin = books.length;
        while (inicio <=fin){
            int centro =  (inicio + fin)/2;
            String nombreCentro = books[centro].getName();
            int comparacion = nombreCentro.compareToIgnoreCase(name);
            if (comparacion == 0){
                return centro;
            }
            if (comparacion > 1){
                inicio = centro+1;
            }
            else{
                fin = centro-1;
            }
        }
            return -1;

    }

    public void buscarBookPorNombre(Book[] books, String nombre) {
        viewConsole view = new viewConsole();
        int index = searchByName(books, nombre);
        
        if (index != -1) {
            System.out.println("Book encontrado, índice: " + index);
            view.showMessage(books[index].toString());
        } else {
            view.showMessage("No encontrado.");
        }
    }
    }
    
    


