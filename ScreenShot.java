import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import java.nio.file.*;
import java.awt.event.InputEvent;
public class ScreenShot{
    public static void press1(Robot robot, int x,int y)
    {
        robot.mouseMove(x,y);
            robot.mousePress(1024);
            robot.mouseRelease(1024);
            robot.delay(30);
    }
public static void main(String args[]) throws InterruptedException, IOException { 
        BufferedImage img;
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); 
        System.out.println(size.getHeight());
        System.out.println(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1);
        
        try {
            Robot robot = new Robot();
            ScreenShot.press1(robot,220,910);
            
            ScreenShot.press1(robot,980,220);
            robot.delay(1000);
            ScreenShot.press1(robot,1380,60);
            ScreenShot.press1(robot,1420,130);
            ScreenShot.press1(robot,1420,130);
            ScreenShot.press1(robot,1380,60);
            robot.mouseMove(740,420);
            robot.mousePress(1024);
            robot.mouseMove(740,365);
            robot.mouseRelease(1024);
            robot.delay(30);
            img = robot.createScreenCapture(new Rectangle(60,130,630,131)); 
        } catch(Exception e) {img = new BufferedImage(1,1,1);}
        
         File outputfile = new File("screenshot.png");
         ImageIO.write(img, "png", outputfile);
         Path path = (outputfile.toPath());
        try{Files.createFile(path); } catch(FileAlreadyExistsException e){}
        System.out.println(size.getWidth());
    }
    
}