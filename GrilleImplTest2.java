import static org.junit.Assert.*;

import org.junit.Test;

public class GrilleImplTest {

	public GrilleImplTest() {
    }

	
	

	
	  private void initSudoku(GrilleImpl grilleImpl) {
	        grilleImpl.setValue(0, 0, '5');
	        grilleImpl.setValue(0, 1, '7');
	        grilleImpl.setValue(0, 2, '4');

	        grilleImpl.setValue(0, 3, '9');
	        grilleImpl.setValue(0, 4, '2');
	        grilleImpl.setValue(0, 5, '3');

	        grilleImpl.setValue(0, 6, '6');
	        grilleImpl.setValue(0, 7, '8');
	        grilleImpl.setValue(0, 8, '1');

	        grilleImpl.setValue(1, 0, '8');
	        grilleImpl.setValue(1, 1, '6');
	        grilleImpl.setValue(1, 2, '9');

	        grilleImpl.setValue(1, 3, '7');
	        grilleImpl.setValue(1, 4, '5');
	        grilleImpl.setValue(1, 5, '1');

	        grilleImpl.setValue(1, 6, '3');
	        grilleImpl.setValue(1, 7, '4');
	        grilleImpl.setValue(1, 8, '2');

	        grilleImpl.setValue(2, 0, '1');
	        grilleImpl.setValue(2, 1, '3');
	        grilleImpl.setValue(2, 2, '2');

	        grilleImpl.setValue(2, 3, '4');
	        grilleImpl.setValue(2, 4, '8');
	        grilleImpl.setValue(2, 5, '6');

	        grilleImpl.setValue(2, 6, '9');
	        grilleImpl.setValue(2, 7, '5');
	        grilleImpl.setValue(2, 8, '7');

	        grilleImpl.setValue(3, 0, '3');
	        grilleImpl.setValue(3, 1, '4');
	        grilleImpl.setValue(3, 2, '5');

	        grilleImpl.setValue(3, 3, '8');
	        grilleImpl.setValue(3, 4, '1');
	        grilleImpl.setValue(3, 5, '7');

	        grilleImpl.setValue(3, 6, '2');
	        grilleImpl.setValue(3, 7, '6');
	        grilleImpl.setValue(3, 8, '9');

	        grilleImpl.setValue(4, 0, '6');
	        grilleImpl.setValue(4, 1, '9');
	        grilleImpl.setValue(4, 2, '8');

	        grilleImpl.setValue(4, 3, '3');
	        grilleImpl.setValue(4, 4, '4');
	        grilleImpl.setValue(4, 5, '2');

	        grilleImpl.setValue(4, 6, '1');
	        grilleImpl.setValue(4, 7, '7');
	        grilleImpl.setValue(4, 8, '5');

	        grilleImpl.setValue(5, 0, '7');
	        grilleImpl.setValue(5, 1, '2');
	        grilleImpl.setValue(5, 2, '1');

	        grilleImpl.setValue(5, 3, '6');
	        grilleImpl.setValue(5, 4, '9');
	        grilleImpl.setValue(5, 5, '5');

	        grilleImpl.setValue(5, 6, '8');
	        grilleImpl.setValue(5, 7, '3');
	        grilleImpl.setValue(5, 8, '4');

	        grilleImpl.setValue(6, 0, '4');
	        grilleImpl.setValue(6, 1, '1');
	        grilleImpl.setValue(6, 2, '3');

	        grilleImpl.setValue(6, 3, '5');
	        grilleImpl.setValue(6, 4, '6');
	        grilleImpl.setValue(6, 5, '9');

	        grilleImpl.setValue(6, 6, '7');
	        grilleImpl.setValue(6, 7, '2');
	        grilleImpl.setValue(6, 8, '8');

	        grilleImpl.setValue(7, 0, '9');
	        grilleImpl.setValue(7, 1, '5');
	        grilleImpl.setValue(7, 2, '7');

	        grilleImpl.setValue(7, 3, '2');
	        grilleImpl.setValue(7, 4, '3');
	        grilleImpl.setValue(7, 5, '8');

	        grilleImpl.setValue(7, 6, '4');
	        grilleImpl.setValue(7, 7, '1');
	        grilleImpl.setValue(7, 8, '6');

	        grilleImpl.setValue(8, 0, '2');
	        grilleImpl.setValue(8, 1, '8');
	        grilleImpl.setValue(8, 2, '6');

	        grilleImpl.setValue(8, 3, '1');
	        grilleImpl.setValue(8, 4, '7');
	        grilleImpl.setValue(8, 5, '4');

	        grilleImpl.setValue(8, 6, '5');
	        grilleImpl.setValue(8, 7, '9');
	        grilleImpl.setValue(8, 8, '3');
	    }
	
	

	
	
	
	
    /**
     * Test de la method getDimension de class GrilleImpl.
     */
    @Test
    public void testGetDimension() {
        System.out.println("Please get the dimension of sudoku (getDimension)");
        GrilleImpl instance = new GrilleImpl(9);
        int expResult = 9;
        int result = instance.getDimension();
        assertEquals(expResult, result);
    }

    /**
     * Test de al method setValue de class GrilleImpl.
     */
    @Test
    public void testSetValue() {
        System.out.println("Yes you have successfully set the values (setValue)");
        int x = 5;
        int y = 3;
        char value = '9';
        GrilleImpl instance = new GrilleImpl(9);
        instance.setValue(x, y, value);
        char expResult = instance.getValue(x, y);
        char result = '9';
        assertEquals(expResult, result);
        
        instance = new GrilleImpl(9);
        instance.setValue(1, 1, '1');
        
        try {
            instance.setValue(0, 1, '1');
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    /**
     * Test de la methode Complete de class GrilleImpl.
     */
    @Test
    public void testComplete() {
        System.out.println("You have completed the Sudoku test (Complete)");
        GrilleImpl instance = new GrilleImpl(9);
        initSudoku(instance);
        boolean expResult = true;
        boolean result = instance.complete();
        assertEquals(expResult, result);
        
        instance = new GrilleImpl(9);
        expResult = false;
        result = instance.complete();
        assertEquals(expResult, result);
    }

    
    
  

    /**
     * Test of method possible, of class GrilleImpl.
     */
    @Test
    public void testPossible() {
        System.out.println("Yes it is possible (Possible)");
        int x = 0;
        int y = 1;
        char value = '1';
        GrilleImpl instance = new GrilleImpl(9);
        instance.setValue(0, 0, '1');
        boolean expResult = false;
        boolean result = instance.possible(x, y, value);
        assertEquals(expResult, result);
        
        //Indices incorrects
        try {
            instance.possible(-1, y, value);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            instance.possible(0, -1, value);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            instance.possible(19, 0, value);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            instance.possible(0, 19, value);
            fail();
        } catch (IllegalArgumentException e) {
        }
        
        //Caractère non autorisé
        try {
            instance.setValue(x, y, 'Z');
            fail();
        } catch (IllegalArgumentException e) {
            //valeur
        }
        
        //Valeur existant en ligne
        instance = new GrilleImpl(9);
        initSudoku(instance);
        expResult = false;
        result = instance.possible(1, 0, '5');
        assertEquals(expResult, result);
        
        //Valeur existant en colone
        instance = new GrilleImpl(9);
        instance.setValue(1, 1, '1');
        expResult = false;
        result = instance.possible(0, 1, '1');
        assertEquals(expResult, result);
        
        //Valeur existant dans le carré local
        instance = new GrilleImpl(9);
        instance.setValue(1, 1, '1');
        expResult = false;
        result = instance.possible(0, 0, '1');
        assertEquals(expResult, result);
    }

    @Test
    public void testGetValue(){
        GrilleImpl instance = new GrilleImpl(9);
        try {
            instance.getValue(-1, 0);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            instance.getValue(0, -1);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            instance.getValue(19, 0);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            instance.getValue(0, 19);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }
}
