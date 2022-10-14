import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceMultipleNumbers(){
    int[] input1 = {0, 101, 0, 2324, 0, 325523, 0, 2002};
    ArrayExamples.reverseInPlace(input1); 
    assertArrayEquals(new int[] {2002, 0, 325523, 0, 2324, 0, 101, 0}, input1); 
  }

  @Test
  public void testReversedMultipleNumbers() {
    int[] input1 = {0, 101, 0, 2324, 0, 325523, 0, 2002};
    assertArrayEquals(new int[]{2002, 0, 325523, 0, 2324, 0, 101, 0}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowestTwoNumbers(){
    double[] input1 = {0.0, 1.0}; 
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input1), 0.0); 
  }

  @Test
  public void testAverageWithoutLowesMultipleSameNumbers(){
    double[] input1 = {1.0, 1.0, 1.0, 1.0}; 
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input1), 0.0); 
  }
}
