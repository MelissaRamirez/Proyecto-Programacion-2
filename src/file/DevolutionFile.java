package file;

import domain.Lending;
import domain.Book;
import domain.Audiovisual;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class DevolutionFile {

    //metodo que determina la cantidad de dias que duro en devolver el material para verificar si hay multa alguna
    public int quantityOfDaysa(String fecha, String studentID, String MaterialID) throws IOException, ClassNotFoundException, ParseException {

        LendFIle lendFile = new LendFIle();
        int days = 0;

        for (int i = 0; i < lendFile.getLendList().size(); i++) {

            Lending lgtemp = lendFile.getLendList().get(i);

            if (lgtemp.getStudentID().equalsIgnoreCase(studentID) && lgtemp.getMaterialID().equalsIgnoreCase(MaterialID)) {

                Date inDate = lendFile.convierteStringADate(lgtemp.getIndate(), "yyyy-MM-dd");
                Date outDate = lendFile.convierteStringADate(fecha, "yyyy-MM-dd");

                days = (int) ((outDate.getTime() - inDate.getTime()) / 86400000);

            } else {
                System.out.println("there is no fine");
            }

        }//fin del for

        return days;
    }// fin del metodo

    //metodo que compara el id del estudiante 
    public Lending confirmIDtoGiveBack(String confirmStudent) throws FileNotFoundException, IOException, ClassNotFoundException {
        Lending confirm = new Lending();

        File file = new File("Lended.obj");
        LendFIle lg = new LendFIle();
        ArrayList<Lending> arrayLendList = lg.getLendList();
        
        for (int i = 0; i < arrayLendList.size(); i++) {

            arrayLendList.get(i);
            if (arrayLendList.get(i).getStudentID().equalsIgnoreCase(confirmStudent)) {

                confirm = arrayLendList.get(i);

            }
        }

        return confirm;
    }

    //compara el id de los estudiantes
    public ArrayList arrayListStudentLend(String confirmStudent) throws FileNotFoundException, IOException, ClassNotFoundException {
        Lending confirm = new Lending();
        ArrayList<Lending> confirm2 = new ArrayList<>();
        File file = new File("Lended.obj");
        LendFIle lg = new LendFIle();

        ArrayList<Lending> arrayLendList = lg.getLendList();
        for (int i = 0; i < arrayLendList.size(); i++) {

            arrayLendList.get(i);
            if (arrayLendList.get(i).getStudentID().equalsIgnoreCase(confirmStudent)) {

                confirm = arrayLendList.get(i);
                confirm2.add(arrayLendList.get(i));
            }

        }
        return confirm2;
    }

    //suma o resta el libro que se devuelve de nuevo a la lista de libros disponibles
    public int retriveOrQuitBooksQuantity(String id, String atribute, int newData) throws IOException, FileNotFoundException, ClassNotFoundException {

        BookFile bkf_methods = new BookFile();

        ArrayList<Book> bookList = bkf_methods.getBookList();
        ArrayList<Book> newBookList = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {

            Book bookListTemp = bookList.get(i);

            if (bookListTemp.getId().equals(id)) {

                if (id.equals(bookListTemp.getId())) {

                    if (atribute.equalsIgnoreCase("Cantidad")) {
                        int tempData = bookListTemp.getQuantity();
                        if (tempData != 0) {
                            if (newData == 1) {

                                bookListTemp.setQuantity(tempData + newData);
                                newBookList.add(bookListTemp);
                            }
                            if (newData == -1) {

                                bookListTemp.setQuantity(tempData + newData);
                                newBookList.add(bookListTemp);
                            }

                        } else {
                            newData = 0;
                        }

                    }
                }

            } else {
                newBookList.add(bookListTemp);
            }

        }//fin del for

        if (newData != 0) {
            File fl = new File("Book.obj");
            int contador = 0;
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fl));
            for (int i = 0; i < newBookList.size(); i++) {

                Book bookListTemp2 = newBookList.get(i);

                try {
                    //para que se sobreescriba solo lo que se desea, el primero FileOutpuStream se le quita la capacidad de escribar
                    //y cuando llega al segundo se le regresa esa capacidad con el true para que sobrescriba lo que se desea 
                    if (contador == 0) {
                        os.writeObject(bookListTemp2);
                        os.close();
                        contador = 1;
                    } else {
                        ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream(fl, true));
                        os1.writeObject(bookListTemp2);
                        os1.close();
                    }

                } catch (IOException ioe) {

                    System.out.println("Error-01");
                }
            }
        }
        return newData;

    }

    //suma o resta el material audio visual de nuevo a la lista de audioVisuales disponibles
    public int retriveOrQuitAVQuantity(String id, String atribute, int newData) throws IOException, FileNotFoundException, ClassNotFoundException {

        AudioVisualFile avf_methods = new AudioVisualFile();

        ArrayList<Audiovisual> audioVisualArray = avf_methods.getAudioVisualList();
        ArrayList<Audiovisual> newaudioVisualArray = new ArrayList<>();

        for (int i = 0; i < audioVisualArray.size(); i++) {

            Audiovisual audioVisualTemp = audioVisualArray.get(i);

            if (audioVisualTemp.getId().equals(id)) {

                if (id.equals(audioVisualTemp.getId())) {

                    if (atribute.equalsIgnoreCase("Cantidad")) {

                        int dataTemp = audioVisualTemp.getQuantity();

                        if (dataTemp != 0) {

                            if (newData == 1) {
                                audioVisualTemp.setQuantity(dataTemp + 1);
                                newaudioVisualArray.add(audioVisualTemp);
                            }

                            if (newData == -1) {

                                audioVisualTemp.setQuantity(dataTemp - 1);
                                newaudioVisualArray.add(audioVisualTemp);
                            }
                        } else {

                            newData = 0;
                        }
                    }
                }

            } else {
                newaudioVisualArray.add(audioVisualTemp);
            }

        }//fin del for

        if (newData != 0) {

            File fl = new File("AudioVisual.obj");
            int contador = 0;
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fl));
            for (int i = 0; i < newaudioVisualArray.size(); i++) {

                Audiovisual audioVisualTemp2 = newaudioVisualArray.get(i);

                try {

                    if (contador == 0) {
                        os.writeObject(audioVisualTemp2);
                        os.close();
                        contador = 1;
                    } else {
                        ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream(fl, true));
                        os1.writeObject(audioVisualTemp2);
                        os1.close();
                    }

                } catch (IOException ioe) {

                    System.out.println("Error-01");
                }

            }
        }

        return newData;
    }//fin del metodo

}//fif
