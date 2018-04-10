package file;

import domain.Audiovisual;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AudioVisualFile {

    //escribe los materiales auidio visuales en el archivo
    public void insertAudioVisual(Audiovisual AVToInsert) throws FileNotFoundException, IOException {

        File fl = new File("AudioVisual.obj");
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fl, true));
        try {

            os.writeObject(AVToInsert);
            os.close();

        } catch (FileNotFoundException fle) {

            System.out.println("File no found");
        }

    }//fin del metodo

    //genera el id de los audio visuales aleatoriamente
    public int writeID() {

        int range = (19999 - 10000) + 1;
        int id = (int) (Math.random() * range) + 10000;
        return id;
    }//fin del metodo

    //compara que no se repita ninguna id 
    public String compareid(int random) throws FileNotFoundException, IOException, ClassNotFoundException {
        String newID = "";
        File f = new File("AudioVisual.obj");
        if (f.exists()) {

            FileInputStream fl = new FileInputStream(f);
            ObjectInputStream ois;

            Object material = new Object();

            try {
                for (;;) {
                    ois = new ObjectInputStream(fl);
                    material = (Audiovisual) ois.readObject();

                    if (material instanceof Audiovisual) {
                        String aux = ((Audiovisual) material).getId();

                        if (aux == Integer.toString(random)) {
                            random = writeID();

                        } else {
                            newID = Integer.toString(random);
                        }

                    }// fin del primer if

                }//fin del for

            } catch (EOFException exc) {

                System.out.println("End of file");
            }
        } else {
            newID = "10000";
        }
        return newID;
    }//fin del metodo

    // cuenta la cantidad de objetos en el archivo para asi darle un tamaño a la arraList
    public int countObject() throws FileNotFoundException, IOException, ClassNotFoundException {

        File f = new File("AudioVisual.obj");
        FileInputStream fl = new FileInputStream(f);
        ObjectInputStream ois;
        Object av = new Object();
        int contador = 0;

        try {
            for (;;) {
                ois = new ObjectInputStream(fl);
                av = (Audiovisual) ois.readObject();
                if (av instanceof Audiovisual) {
                    System.out.println(((Audiovisual) av).toString());
                    contador++;
                }//fin del if

            }//fin del for
        } catch (EOFException exc) {

            System.out.println("End of file");
        }
        return contador;

    }//fin del metodo

    //arrayList de los materiales audio visuales que sirve para mostrar el contenido en una tabla y relizar
    //modificaciones a los objetos
    public ArrayList<Audiovisual> getAudioVisualList() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Audiovisual> audioVisualArray = new ArrayList<>();
        File f = new File("AudioVisual.obj");
        if (f.exists()) {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois;

            Object audioVisual = new Object();
            try {
                int contador = 0;
                for (;;) {

                    /*cuenta la cantidad de objetos en el archivo para que se
                detenga cuando los haya agregado todos al arrayList*/
                    contador++;
                    if (contador == countObject() + 1) {
                        return audioVisualArray;
                    } else {
                        ois = new ObjectInputStream(fis);
                        audioVisual = (Audiovisual) ois.readObject();
                        if (audioVisual instanceof Audiovisual) {

                            audioVisualArray.add((Audiovisual) audioVisual);

                        }

                    }

                }//fin del for

            } catch (FileNotFoundException fne) {
                System.out.println("  error-02  ");
            }

            return audioVisualArray;
        } else {
            return audioVisualArray;
        }
    }//fin del metodo

    //metodo que borra registros de audiovisuales.
    public void borrarObjeto(String id) throws IOException, FileNotFoundException, ClassNotFoundException {

        ArrayList<Audiovisual> audioVisualArray = getAudioVisualList();
        ArrayList<Audiovisual> newaudioVisualArray = new ArrayList<>();

        for (int i = 0; i < audioVisualArray.size(); i++) {

            Audiovisual audioVisualTemp = audioVisualArray.get(i);

            String idt = audioVisualTemp.getId();

            if (audioVisualTemp.getId().equals(id)) {

            } else {
                newaudioVisualArray.add(audioVisualTemp);
            }

        }//fin del for

        File fl = new File("AudioVisual.obj");
        int contador = 0;
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fl));
        for (int i = 0; i < newaudioVisualArray.size(); i++) {

            Audiovisual audioVisualTemp2 = newaudioVisualArray.get(i);

            try {
                //para que se sobreescriba solo lo que se desea, el primero FileOutpuStream se le quita la capacidad de escribar
                //y cuando llega al segundo se le regresa esa capacidad con el true para que sobrescriba lo que se desea 
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

                System.out.println("Error-03");
            }

        }//fin del for

    }//fin del metodo

    //Metodo que actualiza la cantidad de materiales audo visuales
    public void updateAudioVisual(String id, String atribute, String newData) throws IOException, FileNotFoundException, ClassNotFoundException {

        ArrayList<Audiovisual> audioVisualArray = getAudioVisualList();
        ArrayList<Audiovisual> newaudioVisualArray = new ArrayList<>();

        for (int i = 0; i < audioVisualArray.size(); i++) {

            Audiovisual audioVisualTemp = audioVisualArray.get(i);

            if (audioVisualTemp.getId().equals(id)) {

                if (id.equals(audioVisualTemp.getId())) {

                    if (atribute.equalsIgnoreCase("Cantidad")) {
                        audioVisualTemp.setQuantity(Integer.parseInt(newData));
                        newaudioVisualArray.add(audioVisualTemp);

                    }

                }

            } else {
                newaudioVisualArray.add(audioVisualTemp);
            }

        }//fin del for

        File fl = new File("AudioVisual.obj");
        int contador = 0;
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fl));
        for (int i = 0; i < newaudioVisualArray.size(); i++) {

            Audiovisual audioVisualTemp2 = newaudioVisualArray.get(i);

            try {
                //para que se sobreescriba solo lo que se desea, el primero FileOutpuStream se le quita la capacidad de escribar
                //y cuando llega al segundo se le regresa esa capacidad con el true para que sobrescriba lo que se desea 
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

                System.out.println("Error-04");
            }

        }//fin del for

    }//fin del metodo

}//fin
