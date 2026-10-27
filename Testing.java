import java.awt.event.InputEvent;
import java.awt.Robot;
import java.awt.Toolkit;
/**
 * Write a description of class Testing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Testing
{
    public static void main() throws InterruptedException
    {
        Thread.sleep(3000);
        try
        {
            Robot ro = new Robot();
            ro.setAutoDelay(0);
            System.out.println(ro.getAutoDelay());
            for (int i =0; i<100; i++)
            {
                
            }
        } catch (Exception e){}
        
    }
}