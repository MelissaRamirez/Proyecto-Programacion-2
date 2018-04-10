package file;

import domain.Book;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookFile {

    //metodo para insertar los libros
    public void insertBook(Book bookToInsert) throws FileNotFoundException, IOException {

        File fl = new File("Book.obj");

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fl, true));
        try {

            os.writeObject(bookToInsert);
            os.close();

        } catch (IOException ioe) {

            System.out.println("Error-01");
        }

    }//fin del metodo

// metodo que le da el id a los libros
    public String writeID() {
        String id = "";
        long range = (1999999999 - 1000000000) + 1;
        int random = (int) (Math.random() * range) + 10000;
        return Integer.toString(random) + "0000";

    }//fin del metodo

    //metodo para verificar que no se repita el id
    public String compareid(String random) throws FileNotFoundException, IOException, ClassNotFoundException {
        File bookFile = new File("Book.obj");
        String newID = "";
        if (bookFile.exists()) {

            FileInputStream fl = new FileInputStream(bookFile);
            ObjectInputStream ois;

            Object material = new Object();

            try {
                for (;;) {
                    ois = new ObjectInputStream(fl);
                    material = (Book) ois.readObject();
                    if (material instanceof Book) {
                        String aux = ((Book) material).getId();

                        if (aux.equalsIgnoreCase(random)) {
                            random = writeID();
                        } else {
                            newID = random;
                        }

                    }

                }//fin del for

            } catch (EOFException exc) {

                System.out.println("End of file");
            }

        } else {
            bookFile = new File("Book.obj");
            newID = "1000000000000";
            return newID;
        }
        return newID;
    }//fin del metodo

    // metodo que lee el archivo para darle el tamaño a el arrayList
    public int countObject() throws FileNotFoundException, IOException, ClassNotFoundException {

        File bookFile = new File("Book.obj");
        if (bookFile.exists()) {
            FileInputStream fl = new FileInputStream(bookFile);
            ObjectInputStream ois;
            Object book = new Object();
            int contador = 0;

            try {
                for (;;) {
                    ois = new ObjectInputStream(fl);
                    book = (Book) ois.readObject();
                    if (book instanceof Book) {
                        ((Book) book).toString();
                        contador++;

                    }

                }//fin del for

            } catch (EOFException exc) {

                System.out.println("End of file");
            }

            return contador;
        } else {
            return 0;
        }
    }//fin del metodo

    //arrayList de libros
    public ArrayList<Book> getBookList() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Book> bookArray = new ArrayList<>();
        File bookFile = new File("Book.obj");
        if (bookFile.exists()) {
            FileInputStream fis = new FileInputStream(bookFile);
            ObjectInputStream ois;

            Object book = new Object();
            try {
                int contador = 0;
                for (;;) {
                    contador++;
                    if (contador == countObject() + 1) {
                        return bookArray;
                    } else {
                        ois = new ObjectInputStream(fis);
                        book = (Book) ois.readObject();
                        if (book instanceof Book) {

                            bookArray.add((Book) book);

                        }

                    }//fin del else

                }//fin del for

            } catch (FileNotFoundException fne) {
                System.out.println("File no found");
            }

        } else {
            System.out.println("the file dont exist");
        }
        return bookArray;

    }//fin del metodo

    //metodo para borrar libros
    public void removeObjet(String id) throws IOException, FileNotFoundException, ClassNotFoundException {

        ArrayList<Book> bookVisualArray = getBookList();
        ArrayList<Book> newBookVisualArray = new ArrayList<>();

        for (int i = 0; i < bookVisualArray.size(); i++) {

            Book bookTemp = bookVisualArray.get(i);
            String idt = bookTemp.getId();

            if (bookTemp.getId().equals(id)) {

            } else {
                newBookVisualArray.add(bookTemp);
            }

        }//fin del for

        File bookFile = new File("Book.obj");
        int counter = 0;
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(bookFile));

        for (int i = 0; i < newBookVisualArray.size(); i++) {

            Book bookTemp2 = newBookVisualArray.get(i);

            try {
                //para que se sobreescriba solo lo que se desea, el primero FileOutpuStream se le quita la capacidad de escribar
                //y cuando llega al segundo se le regresa esa capacidad con el true para que sobrescriba lo que se desea 
                if (counter == 0) {
                    os.writeObject(bookTemp2);
                    os.close();
                    counter = 1;
                } else {
                    ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream(bookFile, true));
                    os1.writeObject(bookTemp2);
                    os1.close();
                }

            } catch (IOException ioe) {

                System.out.println("Error-03");
            }

        }//fin del for

    }//fin del metodo

    //metodo para actualizar la cantidad de libros  
    public void updateBook(String id, String atribute, String newData) throws IOException, FileNotFoundException, ClassNotFoundException {

        ArrayList<Book> bookVisualArray = getBookList();
        ArrayList<Book> newBookVisualArray = new ArrayList<>();

        for (int i = 0; i < bookVisualArray.size(); i++) {

            Book bookTemp = bookVisualArray.get(i);

            if (bookTemp.getId().equals(id)) {

                if (atribute.equalsIgnoreCase("Cantidad")) {
                    //aqui se le asigna el nuevo valor al objeto de manera que se cambie y se añade al arrayList
                    bookTemp.setQuantity(Integer.parseInt(newData));
                    newBookVisualArray.add(bookTemp);
                }

            } else {
                //se añade el resto de objetos sin cambios al array 
                newBookVisualArray.add(bookTemp);
            }

        }//fin del for

        File bookFile = new File("Book.obj");
        int contador = 0;
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(bookFile));
        for (int i = 0; i < newBookVisualArray.size(); i++) {

            Book bookTemp2 = newBookVisualArray.get(i);

            try {
                //para que se sobreescriba solo lo que se desea, el primero FileOutpuStream se le quita la capacidad de escribar
                //y cuando llega al segundo se le regresa esa capacidad con el true para que sobrescriba lo que se desea 
                if (contador == 0) {
                    os.writeObject(bookTemp2);
                    os.close();
                    contador = 1;
                } else {
                    ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream(bookFile, true));
                    os1.writeObject(bookTemp2);
                    os1.close();
                }

            } catch (IOException ioe) {

                System.out.println("Error-04");
            }

        }//fin del for

    }//fin del metodo

}//fin
