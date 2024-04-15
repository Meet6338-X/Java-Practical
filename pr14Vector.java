import java.util.Vector;
class pr14Vector
{
    public static void main(String[] args)
    {
        Vector<String> v1 = new Vector<>();
        System.out.println("Elements in vector");
        v1.add("Mango Ice Creame");
        v1.add("Banana Ice");
        v1.add("Apple");
        for(String element:v1)
        {
            System.out.println(element);
        }
        boolean containsElement = v1.contains("Banana Ice");
        System.out.println(containsElement);
        System.out.println("The size of the Vector"+v1.size());
        System.out.println("The capacity of the Vector"+v1.capacity());
        System.out.println("The last Element"+v1.lastElement());
        System.out.println("The first Element "+v1.firstElement());
    }
}