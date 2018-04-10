/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Audiovisual;
import file.AudioVisualFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Melissa Ramírez R
 */
public class AudioVisualTest {
    
    public AudioVisualTest() {
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
     public void hello() throws IOException, FileNotFoundException, ClassNotFoundException {
        AudioVisualFile audioVisualFile = new AudioVisualFile();
       
         
    Audiovisual audioVisual = new Audiovisual("Incluye NetBeans y Office", "HP", "13246", "laptop", 7);
  Audiovisual audioVisual2 = new Audiovisual("Incluye Eclipse y Office", "HP", audioVisualFile.compareid(audioVisualFile.writeID()), "laptop", 7);     
  Audiovisual audioVisual3 = new Audiovisual("Incluye CodeBlocks y Office", "HP", audioVisualFile.compareid(audioVisualFile.writeID()), "laptop", 7);
    Audiovisual audioVisual4 = new Audiovisual("Incluye NetBeans y Office", "HP", audioVisualFile.compareid(audioVisualFile.writeID()), "laptop", 7);
     Audiovisual audioVisual5 = new Audiovisual("Incluye NetBeans y Office", "HP", audioVisualFile.compareid(audioVisualFile.writeID()), "laptop", 7);
//     
     
 // audioVisualFile.insertAudioVisual(audioVisual);
// audioVisualFile.insertAudioVisual(audioVisual2);
//  audioVisualFile.insertAudioVisual(audioVisual3);
//     audioVisualFile.insertAudioVisual(audioVisual4);
//     audioVisualFile.insertAudioVisual(audioVisual5);
     
//audioVisualFile.borrarObjeto("4732292260000");
     // System.out.println(audioVisualFile.countObject());
     audioVisualFile.updateAudioVisual("3603288870000", "cantidad", "3");
//     audioVisualFile.insertAudioVisual(audioVisual4);
//     audioVisualFile.insertAudioVisual(audioVisual5);
     

     }
}
