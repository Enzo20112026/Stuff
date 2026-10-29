import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import java.nio.file.*;
import java.awt.event.InputEvent;
import java.awt.*;

public class ScreenShot{
    public static void press1(Robot robot, int x,int y)
    {
        robot.mouseMove(x,y);
            robot.mousePress(1024);
            robot.mouseRelease(1024);
           
    }
public static void main(String args[]) throws InterruptedException, IOException { 
        BufferedImage img;
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); 
        BufferedImage mainImg = new BufferedImage(800,1500,1);
        Thread.sleep(1);
        Graphics g2 = mainImg.createGraphics();
         int imgHeight = 0;
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(30);
            ScreenShot.press1(robot,370,910);
            
            ScreenShot.press1(robot,980,220);
            robot.delay(900);
            ScreenShot.press1(robot,1380,60);
            ScreenShot.press1(robot,1420,130);
            ScreenShot.press1(robot,1420,130);
            ScreenShot.press1(robot,1380,60);
            robot.mouseMove(740,420);
            robot.mousePress(1024);
            robot.mouseMove(740,365);
            robot.mouseRelease(1024);
            
            img = robot.createScreenCapture(new Rectangle(60,130,630,131)); 
            imgHeight += img.getHeight();
            g2.drawImage(img,0,0,null);
            img = robot.createScreenCapture(new Rectangle(775,140,635,60));
            g2.drawImage(img,0,imgHeight,null);
            imgHeight += img.getHeight();
            img = robot.createScreenCapture(new Rectangle(775,550,635,60));
            g2.drawImage(img,0,imgHeight,null);
            imgHeight += img.getHeight();
            ScreenShot.press1(robot,1430,540);
            robot.mouseMove(0,0);
            robot.delay(3000);
            
            img = robot.createScreenCapture(new Rectangle(50,140,635,60));
            g2.drawImage(img,0,imgHeight,null);
            imgHeight += img.getHeight();
            img = robot.createScreenCapture(new Rectangle(50,550,635,60));
            g2.drawImage(img,0,imgHeight,null);
            imgHeight += img.getHeight();
            img = robot.createScreenCapture(new Rectangle(775,140,635,60));
            g2.drawImage(img,0,imgHeight,null);
            imgHeight += img.getHeight();
            img = robot.createScreenCapture(new Rectangle(775,550,635,60));
            g2.drawImage(img,0,imgHeight,null);
            imgHeight += img.getHeight();
            ScreenShot.press1(robot,1430,540);
            robot.mouseMove(0,0);
            robot.delay(3000);
            for (int i = 1; i < 28; i++){}
        } catch(Exception e) {img = new BufferedImage(1,1,1);}
        
         File outputfile = new File("screenshot.png");
         ImageIO.write(mainImg, "png", outputfile);
         Path path = (outputfile.toPath());
        try{Files.createFile(path); } catch(FileAlreadyExistsException e){}
        System.out.println(size.getWidth());
        System.out.println(size.getHeight());
        System.out.println(InputEvent.BUTTON1_DOWN_MASK);
    }
    
}