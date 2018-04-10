/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import domain.Lending;
import file.LendFIle;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.*;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 *
 * @author 1
 */
public class LendingTest {
    
    public LendingTest() {
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
     @Test
     public void hello() {
     
         LendFIle lf= new LendFIle();
         SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
         Date d  =  lf.convierteStringADate("2015-02-01", "yyyy-MM-dd");
        df.format(lf.sumaDias(d, 7));
         System.out.println("   "+lf.sumaDias(d, 7));
     }
}
