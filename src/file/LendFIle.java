package file;

import domain.Lending;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class LendFIle {

    //Escribe el objeto en el archivo serializable 
    public void writeLendedItem(Object itemToLend) throws FileNotFoundException, IOException {
        File lendeditem = new File("Lended.obj");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(lendeditem, true));

        try {

            oos.writeObject((Lending) itemToLend);
            oos.close();

        } catch (FileNotFoundException fne) {

            System.out.println("File not found");
        }

    }

    //Cuenta los objetos existentes en el archivo Lended.obj
    public int countObject() throws FileNotFoundException, IOException, ClassNotFoundException {

        File f = new File("Lended.obj");
        int counter = 0;
        if (f.exists()) {

            FileInputStream fl = new FileInputStream(f);
            ObjectInputStream ois;
            Object lended = new Object();

            try {
                for (;;) {

                    ois = new ObjectInputStream(fl);

                    lended = (Lending) ois.readObject();

                    if (lended instanceof Lending) {
                        ((Lending) lended).toString();
                        counter++;

                    }

                }//fin del for

            } catch (EOFException exc) {

                System.out.println("counting objects");

            }
        } else {
            counter = 0;
        }
        return counter;
    }//fin del metodo

    //devuelve el arrayList para mostrarlo en la tabla de Lending
    public ArrayList<Lending> getLendList() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Lending> lendingArray = new ArrayList<>();
        File f = new File("Lended.obj");

        if (f.exists()) {

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois;

            Object lended = new Object();
            try {
                int contador = 0;
                for (;;) {

                    contador++;

                    if (contador == countObject() + 1) {

                        return lendingArray;
                    } else {
                        ois = new ObjectInputStream(fis);
                        lended = (Lending) ois.readObject();
                        if (lended instanceof Lending) {

                            lendingArray.add((Lending) lended);

                        }

                    }

                }//fin del for

            } catch (FileNotFoundException fne) {
                System.out.println("file no found");
            }

            return lendingArray;
        } else {
            return lendingArray;
        }

    }//fin del metodo

    //metodo que devuelve una fecha de entrega
    public Date sumaDias(Date fecha, int dias) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.add(Calendar.DAY_OF_YEAR, dias);

        return cal.getTime();

    }//fin del metodo

//metodo para darle formato a las fechas de jcalendar
    public Date convierteStringADate(String stringFecha, String formato) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            Date fecha = sdf.parse(stringFecha);
            return fecha;
        } catch (Exception e) {

            return null;
        }
    }//fin del metodo

    //metodo para borrar objetos de la lista de lending cuando se devuelve el material
    public void borrarObjeto(String id, String idMaterial) throws IOException, FileNotFoundException, ClassNotFoundException {
        File fl = new File("Lended.obj");
        ArrayList<Lending> audioVisualArray = getLendList();
        if (fl.exists()) {
            fl.delete();
            ArrayList<Lending> newLendedArray = new ArrayList<>();

            for (int i = 0; i < audioVisualArray.size(); i++) {

                Lending lendedTemp = audioVisualArray.get(i);

                String idt = lendedTemp.getStudentID();

                if (lendedTemp.getStudentID().equals(id) && lendedTemp.getMaterialID().equals(idMaterial)) {

                } else {
                    newLendedArray.add(lendedTemp);
                }

            }//fin del for

           
            fl = new File("Lended.obj");
            int counter = 0;
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fl));
            for (int i = 0; i < newLendedArray.size(); i++) {

                Lending lendedTemp2 = newLendedArray.get(i);

                try {
                    //para que se sobreescriba solo lo que se desea, el primero FileOutpuStream se le quita la capacidad de escribar
                    //y cuando llega al segundo se le regresa esa capacidad con el true para que sobrescriba lo que se desea 
                    if (counter == 0) {
                        os.writeObject(lendedTemp2);
                        os.close();
                        counter = 1;
                    } else {
                        ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream(fl, true));
                        os1.writeObject(lendedTemp2);
                        os1.close();
                    }

                } catch (IOException ioe) {

                    System.out.println("Error-03");
                }

            }

        } else {
            System.out.println("file dont exist");
        }
    }//fin del metodo
}//fin
