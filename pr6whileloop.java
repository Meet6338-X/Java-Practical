class pr6whileloop
{
    public static void main(String[] args)
    {
        int i = 1;
        do
        {
            System.out.print(i+",");
            i++;
        }while(i<=50);
        System.out.println();
        while (i>1) 
        {
            i--;        
            System.out.print(i+",");
        }
    }
}
