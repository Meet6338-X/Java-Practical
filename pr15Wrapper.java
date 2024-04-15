class pr15Wrapper
{
    public static void main(String[] args)
    {
        int a = 69;
        int b = 45;
        boolean c = false;
        double d = 3.14;
        char ch = 'M';
        byte bt = 4;
        System.out.println("Number 1 = "+a);
        System.out.println("Number 2 = "+b);
        System.out.println("Number 3 = "+c);
        System.out.println("Number 4 = "+d);
        System.out.println("Number 1 = "+ch);
        System.out.println("Number 5 = "+bt);

        System.out.println("After Wapper Class");

        Integer opa = a;
        Integer opb = b;
        Boolean opc = c;
        Double opd = d;
        Character opch = ch;
        Byte opbt = bt;
        System.out.println("Number 1 = "+opa);
        System.out.println("Number 2 = "+opb);
        System.out.println("Number 3 = "+opc);
        System.out.println("Number 4 = "+opd);
        System.out.println("Number 1 = "+opch);
        System.out.println("Number 5 = "+opbt);
    }    
}

