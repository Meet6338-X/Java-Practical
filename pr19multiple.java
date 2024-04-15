interface Xop
{
    public void mystyle();
}
interface Yop
{
    public void mystyle();
}
public class pr19multiple implements Xop,Yop
{
    public void mystyle()
    {
        System.out.println("Implements more than one Interface .");
    }
    public static void main(String[] args)
    {
        pr19multiple obj = new pr19multiple();
        obj.mystyle();
    }
}
