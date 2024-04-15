class q10524 
{
    public double real;
    public double imaginary;
    public q10524() 
    {
        this.real = 0.0;
        this.imaginary = 0.0;
    }
    
    public q10524(double r, double i) 
    {
        this.real = r;
        this.imaginary = i;
    }

    public q10524(q10524 cop)
    {
        this.real = cop.real;
        this.imaginary = cop.imaginary;
    }
    
    @Override
    public String toString() 
    {
        return "(" + real + "+" + imaginary + ")";
    }
}

public class pr10constructor 
{
    public static void main(String[] args) 
    {
        q10524 complex1 = new q10524();
        q10524 complex2 = new q10524(3.5, 2.0);
        q10524 complex3 = new q10524(complex2);
        
        System.out.println("Default Constructor : " + complex1);
        System.out.println("Parameteric Constructor : " + complex2);
        System.out.println("Copy Constructor : " + complex3);
    }    
}