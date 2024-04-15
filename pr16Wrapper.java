/**
 * pr16Wrapper
 */
public class pr16Wrapper 
{
    public static void main(String[] args) 
    {
        System.out.println("Wrapper Class...");
        Integer opa = 69;
        Integer opb = 45;
        Boolean opc = false;
        Double opd = 3.14;
        Character opch = 'M';
        Byte opbt = 4;
        
        System.out.println("Number 1 = " + opa);
        System.out.println("Number 2 = " + opb);
        System.out.println("Number 3 = " + opc);
        System.out.println("Number 4 = " + opd);
        System.out.println("Number 1 = " + opch);
        System.out.println("Number 5 = " + opbt);
        
        int apa = opa;
        int apb = opb;
        boolean apc = opc;
        double apd = opd;
        char apch = opch;
        byte apbt = opbt;
        
        System.out.println("Number 1 = " + apa);
        System.out.println("Number 2 = " + apb);
        System.out.println("Number 3 = " + apc);
        System.out.println("Number 4 = " + apd);
        System.out.println("Number 1 = " + apch);
        System.out.println("Number 5 = " + apbt);
    }
}