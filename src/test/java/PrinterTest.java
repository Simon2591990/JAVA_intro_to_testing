import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){printer = new Printer(100, 100);}

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(3, 5);
        assertEquals(85, printer.getPaper());
    }
    @Test
    public void cantPrint(){
        printer.print(15, 10);
        assertEquals(100, printer.getPaper());
    }
    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }
    @Test
    public void printReducesToner(){
        printer.print(3, 5);
        assertEquals(85, printer.getToner());
    }
}
