class shape
{
    void display()
    {
        System.out.println("This is an Shape. ");
    }
}
class Rectangle extends shape
{
    void draw()
    {
        System.out.println("Drawing a rectangle.");
    }
}
class circlq extends Rectangle
{
    void draw()
    {
        System.out.println( "Drawing a circle." );
    }
}
public class pr18Inhert
{
    public static void main (String[] args)
    {
        Rectangle mrect  = new Rectangle();
        circlq mcir = new circlq();
        
        mrect.display();
        mrect.draw();
        
        System.out.println("\n");
        mcir.display();
        mcir.draw();
    }
}
