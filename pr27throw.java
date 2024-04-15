import java.util.*;
class NotMatchException extends Exception
{
    NotMatchException (String msg)
    {
        super(msg);
    }
}
public class pr27throw
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = sc.next();
        if (str.equals("MSBTE"))
        {
            System.out.println("String Equal . ");            
        }
        else
        {
            try
            {
                throw new NotMatchException("Not Match");
            }
            catch(NotMatchException e)
            {
                System.out.println(e);
            }
        }
    }
}