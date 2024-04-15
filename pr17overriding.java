class supercat
{
    public void display()
    {
        System.out.println("This is a Super Class . ");
    }
}
class sublion extends supercat
{
    //Overriding the method
    public void display()
    {
        System.out.println("This is Sub Lion Class , I am extending Super Cat");
    }
}
class pr17overriding 
{
    public static void main(String[] args) 
    {
        supercat obj = new supercat();
        sublion objsub = new sublion();
        obj.display();
        objsub.display();
    }    
}