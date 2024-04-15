class pr25trycatch
{
    public static void main(String[] args)
    {
        int num=10;
        int result = 0;
        try
        {
            result = num/0;
            System.out.println("Result := " + result);
        }
        catch(Exception e)
        {
            System.out.println("Error: Division");
        }
        finally
        {
            System.out.println("Final Block Executed ..");
        }
    }
}
