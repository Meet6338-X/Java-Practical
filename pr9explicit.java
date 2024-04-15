class pr9explicit
{
    public static void main(String[] args)
    {
        double d = 90.0;
        float f = (float)d;
        long l = (long)f;
        int i = (int)l;
        byte bt = (byte)i;
        System.out.println("Double = "+d);
        System.out.println("Float = "+f);
        System.out.println("Long = "+l);
        System.out.println("Integer = "+i);
        System.out.println( "Byte = "+bt);
    }    
}