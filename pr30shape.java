// Cone,Cylinder,cube,Square inside circle,circle inside square
/* <applet code = "pr30shape.class" width = "1000" height = "1000"></applet> */
import java.applet.*;
import java.awt.*;
public class pr30shape extends Applet 
{
    public void paint(Graphics g) 
    {
        // Set Background
        setBackground(Color.YELLOW);
        // Cone
        g.setColor(Color.BLACK);
        g.drawOval(100, 200, 200, 80);
        g.drawLine(100, 260, 200, 330);
        g.drawLine(300, 260, 200, 330);
        // Draw Cylinder
        g.drawRect(500, 100, 200, 200);
        g.drawOval(500, 80, 200, 40);
        g.drawOval(500, 280, 200, 40);
        g.drawLine(500, 120, 500, 280);
        g.drawLine(700, 120, 700, 280);



        // Draw Square inside a Circle
        g.drawOval(500, 400, 200, 200);
        g.drawRect(550, 450, 100, 100);
        // Draw Circle inside a Square
        g.drawRect(800, 400, 200, 200);
        g.drawOval(800, 400, 200, 200);
    }
}