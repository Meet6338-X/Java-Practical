import java.util.*;
class pr3condition
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You age !!");
        int age = sc.nextInt(); 
        if(age>=18)
        { 
            System.out.println("You can vote...........!");
        }
        else
        {
            System.out.println("You are Not Eligible to vote..!");
            System.out.println("You Will Eligible in "+(18-age)+" Year");
        }
    }
}