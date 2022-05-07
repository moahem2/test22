import static org.junit.Assert.*;
import org.junit.Test;
public class CheckEvenOddTest {
    @Test
    public void even1(){
        CheckEvenOdd y = new CheckEvenOdd(); int n = 16; assertEquals("weight is even",y.check(n));
    }
    @Test
    public void even2(){
        CheckEvenOdd y = new CheckEvenOdd(); int n = 50; assertEquals("weight is even",y.check(n));
    }
    @Test
    public void odd1(){
        CheckEvenOdd y = new CheckEvenOdd(); int n = 39; assertEquals("weight is odd",y.check(n));
    }
    @Test
    public void odd2(){
        CheckEvenOdd y = new CheckEvenOdd(); int n = 51; assertEquals("weight is odd",y.check(n));
    }
    @Test
    public void zero(){
        CheckEvenOdd y = new CheckEvenOdd();
        int x = 0;
        assertEquals("weight is even",y.check(x));
    }
    @Test(expected = IllegalArgumentException.class) public void negative(){
        CheckEvenOdd n = new CheckEvenOdd(); int x = -8;
        n.check(x);
    }
}
