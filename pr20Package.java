// Create a Floder in it create a file called as mypack paste this code and run
package mypack;
public class Mypackage
{
    public void sayHello() 
    {
        System.out.println("Hello from MyClass in mypackage!");
    }
}
// main file out of package Folder
import mypack.Mypackage;
public class pr20Package
{
    public static void main(String[] args) 
    {
        Mypackage packObj = new Mypackage();
        packObj.sayHello();
    }
    
}
