/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeo;

import com.mycompany.ejerciciounitarias.Persona;
import com.mycompany.ejerciciounitarias.Generacion;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Steven
 */
public class test {
    static Map<Integer,Persona> abueloMap = new HashMap();
    public test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        Persona abue1 = new Persona(1,"julio","gomez");
        Persona abue2 = new Persona(2,"hector","rodriguez");
        abueloMap.put(1, abue1);
        abueloMap.put(2, abue2);
        Persona padre1 = new Persona(3,"jorge","gomez");
        Persona padre2 = new Persona(4,"victor","gomez");
        Persona padre3 = new Persona(5,"luis","gomez");
        abueloMap.get(1).personaMap.put(3, padre1);
        abueloMap.get(1).personaMap.put(4, padre2);
        abueloMap.get(1).personaMap.put(5, padre3);
      
        Persona padre4 = new Persona(6,"carlos","rodriguez");
        Persona padre5 = new Persona(7,"ismael","rodriguez");
        Persona padre6 = new Persona(8,"alexis","rodriguez");
        abueloMap.get(2).personaMap.put(6, padre4);
        abueloMap.get(2).personaMap.put(7, padre5);
        abueloMap.get(2).personaMap.put(8, padre6);
  
        Persona hijo1 = new Persona(9,"steven","gomez");
        Persona hijo2 = new Persona(10,"juan","gomez");
        abueloMap.get(1).personaMap.get(3).personaMap.put(9, hijo1);
        abueloMap.get(1).personaMap.get(3).personaMap.put(10, hijo2);
        Persona hijo3 = new Persona(11,"anderson","gomez");
        Persona hijo4 = new Persona(12,"smith","gomez");
        abueloMap.get(1).personaMap.get(4).personaMap.put(11, hijo3);
        abueloMap.get(1).personaMap.get(4).personaMap.put(12, hijo4);
        
        Persona hijo5 = new Persona(13,"jeison","gomez");
        Persona hijo6 = new Persona(14,"alejandra","gomez");
        abueloMap.get(1).personaMap.get(5).personaMap.put(13, hijo5);
        abueloMap.get(1).personaMap.get(5).personaMap.put(14, hijo6);
        
        Persona hijo7 = new Persona(15,"jessica","Rodriguez");
        Persona hijo8 = new Persona(16,"luisa","Rodriguez");
        abueloMap.get(2).personaMap.get(6).personaMap.put(15, hijo7);
        abueloMap.get(2).personaMap.get(6).personaMap.put(16, hijo8);
        
        Persona hijo9 = new Persona(17,"paula","Rodriguez");
        Persona hijo10 = new Persona(18,"andrea","rodriguez");
        abueloMap.get(2).personaMap.get(7).personaMap.put(17, hijo9);
        abueloMap.get(2).personaMap.get(7).personaMap.put(18, hijo10);
        
        Persona hijo11 = new Persona(19,"felipe","rodriguez");
        Persona hijo12 = new Persona(20,"andres","rodriguez");
        abueloMap.get(2).personaMap.get(8).personaMap.put(19, hijo11);
        abueloMap.get(2).personaMap.get(8).personaMap.put(20, hijo12);

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
    // @Test
    // public void hello() {}
    @Test
    public void test1(){
    
    Generacion gene = new Generacion();
    String compa = " julio jorge steven juan victor anderson smith luis jeison alejandra";
    String cadena = gene.recorrer(abueloMap,1);
    assertEquals(compa,cadena);
  }
    
     @Test
    public void test2(){
    
    Generacion gene = new Generacion();
    String compa = " julio jorge steven juan";
    String cadena = gene.recorrer(abueloMap,3);
    assertEquals(compa,cadena);
  }
    
     @Test
    public void test3(){
    
    Generacion gene = new Generacion();
    String compa = " julio jorge juan";
    String cadena = gene.recorrer(abueloMap,10);
    assertEquals(compa,cadena);
  }
    
     @Test
    public void test4(){
    
    Generacion gene = new Generacion();
    String compa = " hector ismael paula andrea";
    String cadena = gene.recorrer(abueloMap,7);
    assertEquals(compa,cadena);
  }
     @Test
    public void test5(){
    
    Generacion gene = new Generacion();
    String compa = " hector alexis felipe";
    String cadena = gene.recorrer(abueloMap,19);
    assertEquals(compa,cadena);
  }
}
