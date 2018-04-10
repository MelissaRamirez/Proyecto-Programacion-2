

import domain.Student;
import file.StudentFIle;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
     @Test
     public void hello() throws IOException {
    
    File file = new File("./student.dat");
    StudentFIle studentFile = new StudentFIle(file);
       
        
     Student s1 = new Student("Juan", "Informatica", 2017, studentFile.idCollegeGenerate("Informatica", 2017));
        Student s2 = new Student("Muan", "Informatica", 2017,studentFile.idCollegeGenerate("Informatica", 2017));
       Student s3 = new Student("Tuan", "Informatica", 2017,studentFile.idCollegeGenerate("Direccion", 2017));
        //  Student s4 = new Student("Tuan", "Informatica", 2017,
             // studentFile.idCollegeGenerate("Agronomia", 2017));
        
    
        
     studentFile.addEndRecord(s1);
     studentFile.addEndRecord(s2);
     studentFile.addEndRecord(s3);
//        studentFile.addEndRecord(s4);
//        
      
    
        ArrayList<Student> myArraylist = studentFile.getStudentList();

        
        String contador = "12345";
        int contador2 = 1+ Integer.parseInt(contador.substring(2, 5));
     
       
        
    }
                   
     
}
