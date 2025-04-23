
package View;
import Models.Book;

public class viewConsole{

    public void showMessage(String mensaje) {
        System.out.println(mensaje);

    }
    public void mostrarBook(Book [] books){
        for (int i=0; i<books.length; i ++){
            System.out.println(books[i].toString());
        }

    }
}