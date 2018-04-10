package file;

import domain.Student;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class StudentFIle {

    public RandomAccessFile randomAccessFile;
    private int regsQuantity;//cantidad de registros que tiene mi archivo
    private int regsSize;// tamaño en bytes de mi registro
    private String myFilePath;//camino del archivo

    //constructor
    public StudentFIle(File file) throws IOException {

        this.myFilePath = file.getPath();

        //tamaño maximo de cada registro en el archivo
        this.regsSize = 140;

        //una validacion basica de file
        if (file.exists() && !file.isFile()) {

            throw new IOException(file.getName() + "is an invalid file");

        } else {

            //crear una instancia de RAF
            randomAccessFile = new RandomAccessFile(file, "rw");

            //registros que tiene el archivo
            this.regsQuantity = (int) Math.ceil((double) randomAccessFile.length() / (double) this.regsSize);

        }
    }// fin metodo

    //metodo para insertar a un estudiante una posicion especifica
    public boolean putValue(int position, Student studentToInsert) throws IOException {

        //validacion para el tamaño del registro
        if (position >= 0 && position <= this.regsQuantity) {

            //verificar que el tamaño sea el adecuado
            if (studentToInsert.sizeBytes() > this.regsSize) {

                System.out.println("1002- record size is too large");
                return false;

            } else {

                //escribir en el archivo
                randomAccessFile.seek(position * this.regsSize);
                randomAccessFile.writeUTF(studentToInsert.getStudent());
                randomAccessFile.writeUTF(studentToInsert.getCareer());
                randomAccessFile.writeInt(studentToInsert.getYear());
                randomAccessFile.writeUTF(studentToInsert.getIdCollege());

                return true;
            }

        } else {

            System.out.println("1001-position is out of bounds");
            return false;
        }

    }//fin metodo 

    //metodo que esribe al final del archivo
    public boolean addEndRecord(Student student) throws IOException {

        boolean success = putValue(this.regsQuantity, student);

        if (success) {

            ++this.regsQuantity;

        }
        return success;

    }//fin metodo 

    //obtener un estudiante de una psicion especifica
    public Student getStudent(int position) throws IOException {

        if (position >= 0 && position <= this.regsQuantity) {

            randomAccessFile.seek(position * this.regsSize);
            //leer
            Student studentTemp = new Student();
            studentTemp.setStudent(randomAccessFile.readUTF());
            studentTemp.setCareer(randomAccessFile.readUTF());
            studentTemp.setYear(randomAccessFile.readInt());
            studentTemp.setIdCollege(randomAccessFile.readUTF());

            if (studentTemp.getStudent().equals("deleted")) {
                return null;

            } else {
                return studentTemp;
            }

        } else {

            System.out.println(" 1003- position is out bounds");
            return null;
        }
    }//fin del metodo

    //metodo para retornar todos los estudiantes dentro del archivo
    public ArrayList<Student> getStudentList() throws IOException {
        //crear una instancia  de un array list
        ArrayList<Student> arrayListOfStudents = new ArrayList<>();

        //recorrer el arreglo para insertar en la lista
        for (int i = 0; i < regsQuantity; i++) {

            Student studentTemp = getStudent(i);

            //insertar ese estudiante en la lista
            if (studentTemp != null) {
                arrayListOfStudents.add(studentTemp);

            }
        }//fin del for

        return arrayListOfStudents;
    }//fin del metodo

    //metodo que genera un arrayList de estudiantes 
    public ArrayList<Student> getCareerList(String career) throws IOException {

        ArrayList<Student> arrayListOfStudents = new ArrayList<>();

        for (int i = 0; i < regsQuantity; i++) {

            Student studentTemp = getStudent(i);

            if (studentTemp.getCareer().equalsIgnoreCase(career)) {

                arrayListOfStudents.add(studentTemp);

            }
        }//fin del for

        return arrayListOfStudents;
    }//fin del metodo

    //metodo para borrar
    public boolean deleteRecord(String idCollege) throws IOException {
        Student studentTemp;
        boolean success = false;

        for (int i = 0; i < this.regsQuantity; i++) {
            studentTemp = this.getStudent(i);

            if (studentTemp != null) {

                if (studentTemp.getStudent().equals(idCollege)) {
                    studentTemp.setStudent("deleted");

                    //pone el deleted para que no se muestre en el ArrayList
                    this.putValue(i, studentTemp);
                    success = true;
                }
            }

        }//fin del for
        return success;
    }//fin del metodo

    //metodo que compara el id de los estudiantes para que no se repitan
    public boolean compareStudenID(String idCollege) throws IOException {
        Student studentTemp;
        boolean success = false;

        for (int i = 0; i < this.regsQuantity; i++) {
            studentTemp = this.getStudent(i);

            if (studentTemp != null) {

                if (studentTemp.getIdCollege().equalsIgnoreCase(idCollege)) {

                    success = true;

                }
            }
        }//fin del for

        return success;
    }//fin del metodo

    //metodo que verifica la exstencia del estudiante en el sistema por medio del id
    public Student getStudenID(String idCollege) throws IOException {
        Student studentTemp = new Student();

        for (int i = 0; i < this.regsQuantity; i++) {
            studentTemp = this.getStudent(i);

            if (studentTemp != null) {

                if (studentTemp.getIdCollege().equalsIgnoreCase(idCollege)) {

                    return studentTemp;

                }
            }
        }//fin del for

        return studentTemp;
    }//fin del metodo

    //metodo que genera el id del estudiante dependiendo del año de ingreso y su carrera
    public String idCollegeGenerate(String carrer, int year) throws IOException {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        String id = "";
        int contador = 100;
        char tempCareer = ' ';
        int tempYear = 0;

        if (regsQuantity == 0) {
            tempCareer = carrer.charAt(0);
            tempYear = year % 10;
            id = Character.toString(tempCareer) + tempYear + contador;

        } else {
            for (int i = 0; i < regsQuantity; i++) {

                Student studentTemp = getStudent(i);
                contador = Integer.parseInt((studentTemp.getIdCollege()).substring(2, 5));
                String tempS = studentTemp.getIdCollege();

                if (Integer.parseInt(tempS.substring(2, 5)) == contador) {
                    contador = 1 + contador;
                }

                tempCareer = carrer.charAt(0);
                tempYear = year % 10;
                id = Character.toString(tempCareer) + tempYear + Integer.toString(contador);

            }//fin del for

        }

        return id;
    }//fin del metodo

}//fin
