import static org.junit.Assert.*;
import org.junit.Test;
public class MinMaxElementsTest {
    @Test
    public void testcase1(){
        MinMaxElements y = new MinMaxElements(); int[] x ={423,43,5,6,764,7,865,-23,432,56,4,66};
        assertEquals(-23,y.Min(x)); assertEquals(764, y.Max(x));
    }
    @Test
    public void testcase2(){
        MinMaxElements y = new MinMaxElements(); int[] x = {434,543,5,54,64,76,86,-234,53,-34};
        assertEquals(-234,y.Min(x)); assertEquals(543, y.Max(x));
    }
    @Test
    public void testcase3(){
        MinMaxElements y = new MinMaxElements();
        int[] x = {1,9}; assertEquals(1,y.Min(x)); assertEquals(9, y.Max(x));
    }
    @Test
    public void testcase4(){
        MinMaxElements y = new MinMaxElements(); int[] x = {4}; assertEquals(4,y.Min(x)); assertEquals(4, y.Max(x));
    }
    @Test
    public void testcase5(){
        MinMaxElements y = new MinMaxElements(); int[] x = {53, 345, 42, 532, 421, 23, 2022, -24};
        assertEquals(-24,y.Min(x)); assertEquals(2022, y.Max(x));
    }
}
