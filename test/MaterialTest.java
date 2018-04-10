
import domain.Material;
import file.BookFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1
 */
public class MaterialTest {

    public MaterialTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
//    @Test
//    public void hello() throws IOException, FileNotFoundException, ClassNotFoundException {
//        BookFile mt = new BookFile();
//        Material material = new Material("mmorpg", "33", 1, true);
//        Material material2 = new Material("mmorpg2", "334", 2, true);
//        Material material3 = new Material("mmorpg3", "667", 3, false);
//
//        mt.Material_File("Material.obj", material);
//        mt.Material_File("Material.obj", material2);
//        mt.Material_File("Material.obj", material3);
//
//    }
    @Test
    public void hello2() throws IOException, FileNotFoundException, ClassNotFoundException, ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

 

		      Date fechaInicial=dateFormat.parse("2016-02-14");

		Date fechaFinal=dateFormat.parse("2016-02-22");

 

		int dias=(int) ((fechaInicial.getTime()-fechaFinal.getTime())/86400000);

 

		System.out.println("Hay "+dias+" dias de diferencia");

	}
 
 
    

}
