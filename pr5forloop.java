// Develop a program to demonstrate use of looping statement 'For'.
// Print table for looping statement
import java.util.*;
public class pr5forloop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println("Table = " + i + " * " + p + " = "+i*p);
        }
    }
}
