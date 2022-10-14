import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testAppendInfiniteLoop(){
        final String s = "1 2 3 4 5 ";
        LinkedList input = new LinkedList();
        for(int i=0; i<5; i++){
            input.append(i+1); 
        }
        assertEquals(s, input.toString()); 
    }
}
