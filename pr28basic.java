import java.applet.*;
import java.awt.*;
/*<applet code="pr28basic.class" width = "500" height = "500"></applet>*/
public class pr28basic extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Hello Aashu ", 120, 150);
		for(int i=0;i<=3;i++)
		{
			if(i==1)
			{		
				g.drawLine(10,20,30,40);
			}
			if(i==2)
			{
				g.drawOval(100,100,100,100);
			}
			if(i==3)
			{
				g.drawRect(200,200,80,80);
			}		
		}
	}
}
