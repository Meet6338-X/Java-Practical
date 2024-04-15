import java.applet.*;
import java.awt.*;
public class pr29rect extends Applet
{
    public void paint(Graphics g)
    {
        g.drawLine(180, 200, 180, 400);
        g.drawRect(10, 10, 90, 90);
        g.drawOval(200, 200, 100, 100);
        g.drawOval(350, 450, 100, 200);
        g.drawArc(120, 120, 100, 100, 0, 180);
        
        int[] xPoints = {300, 350, 300};
        int[] yPoints = {300, 350, 400};
        g.drawPolygon(xPoints, yPoints, 3);
        
        int[] xFillPoints = {400, 450, 400};
        int[] yFillPoints = {300, 350, 400};
        g.fillPolygon(xFillPoints, yFillPoints, 3);
    }
}

/*
<applet code="pr29rect.class" width="500" height="645">
</applet>
*/