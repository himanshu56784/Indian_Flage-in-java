import java.util.*;
import java.awt.*;
class Fdemo extends Frame
{
Fdemo()
{
setVisible(true);
setSize(800,400);
setLocation(200,200);
Color s=new Color(64,0,128);
setBackground(Color.red);
setTitle("INDIA FLAG");	
}	
public void paint(Graphics g)	
{
Font f=new Font("Algerian",Font.ITALIC,200);

Color c=new Color(255,128,0);
g.setFont(f);
g.setColor(c);	
g.drawString("IN",600,300);
g.fillRect(200,100,400,100);
g.setColor(Color.white);
g.setFont(f);
g.drawString("D",770,300);
g.fillRect(200,200,400,100);
g.setColor(Color.green);
g.setFont(f);
g.drawString("IA",880,300);
g.fillRect(200,300,400,100);
g.setColor(Color.black);
g.drawLine(200,100,200,700);
g.drawLine(190,100,190,700);
g.fillRect(190,100,10,600);

Color c1=new Color(94,94,94);//for pillor draw
g.setColor(c1);
g.fillRect(100,600,200,75);
g.fillRect(75,650,250,75);
g.fillRect(50,700,300,75);

g.setColor(Color.black);
g.drawRect(100,600,200,50);
g.drawRect(75,650,250,50);
g.drawRect(50,700,300,75);

//for raci
g.setColor(Color.black);
g.drawArc(50,100,300,300,90,180);
g.drawArc(50,110,280,280,90,180);
g.drawArc(100,400,180,180,270,180);
g.drawArc(100,392,180,180,270,180);
//emoj

g.setColor(Color.yellow);
g.fillOval(800,600,200,200);		
g.setColor(Color.black);
g.fillOval(850,650,20,20);		
g.setColor(Color.white);
g.fillOval(855,650,10,10);
g.setColor(Color.black);
g.fillOval(920,650,20,20);
g.setColor(Color.white);
g.fillOval(925,650,10,10);
g.setColor(Color.black);
g.drawArc(860,690,80,70,180,180);
//circule
g.setColor(Color.blue);
g.drawOval(350,200,100,100);
int sa=0;
int ma=5;
for(int i=1;i<=24;i++)
{
try{Thread.sleep(50);}catch(Exception e){}	
g.fillArc(350,200,100,100,sa,ma);
sa+=15;	
}

}	 
}
class Demo8
{
public static void main(String ar[])
{
Fdemo f=new Fdemo();
}
}