import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import java.nio.file.*;
public class ScreenShot{
public static void main(String args[]) throws IOException { 
        BufferedImage img;
        try { 
            Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); 
            Robot robot = new Robot(); 
             img = robot.createScreenCapture(new Rectangle(size)); 
        } catch(Exception e) {  img = new BufferedImage(1,1,1);
        } 
         File outputfile = new File("screenshot.png");
         ImageIO.write(img, "png", outputfile);
         Path path = (outputfile.toPath());
        try{Files.createFile(path); } catch(FileAlreadyExistsException e){}
        System.out.println("it worked");
    }
}