import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays; 

public class ListTests {
    @Test
    public void testFilter(){
        List<String> input1 = new ArrayList<>(Arrays.asList("abc", "dsa", "abbsoi"));
        List<String> input_result = ListExamples.filter(input1, (s)->true); 
        assertEquals(input1, input_result); 
    }

    @Test
    public void testMerge(){
        List<String> input1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> input2 = new ArrayList<>(Arrays.asList("d", "e", "f"));
        List<String> output_desired = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        List<String> input_result = ListExamples.merge(input1, input2); 
        assertEquals(output_desired, input_result); 
    }
}
