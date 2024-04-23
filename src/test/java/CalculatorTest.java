import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
  Calculator cal=new Calculator();

   public void testadd() {
   assertEquals(2,cal.add(1,1));
  }
/*  public void testsub() {
    assertEquals(2,cal.sub(1,1));
   }*/
}
