import org.junit.Test;
import static org.junit.Assert.*;


public class MathTest {
    
    @Test
    public void mathTest() {
        JUNITMath test = new JUNITMath();
 
        int result = test.math(10, 1, 10, 1);
  				
        assertEquals(1, result);
        
            
        assertTrue (10 <= result);

        
        assertFalse(20 >= result);
  
        
        assertNotNull(result);
        
        
        assertNull(result);
        
        
        assertSame(20,result);
        
        
        assertNotSame(20,result);
 
    }
}