import java.util.*;
public class complex{
    int r1,r2,i1,i2,real,img;
    complex()
    {
        r1=3;
        i1=2;
        r2=2;
        i2=4;
        real=r1+r2;
        img=i1+i2;
        System.out.println("\nDEFAULT  CONSTRUCTOR");
        System.out.println("\nc1 = "+r1+"+i"+i1);
        System.out.println("\nc2 = "+r2+"+i"+i2);
        System.out.println("\nc1+c2 = "+real+"+i"+img);

    }
    complex(int r1,int i1,int r2,int i2)
    {
        real=r1+r2;
        img=i1+i2;
        System.out.println("\nc1 = "+r1+"+i"+i1);
        System.out.println("\nc2 = "+r2+"+i"+i2);
        System.out.println("\nc1+c2 = "+real+"+i"+img);  
    }
    complex(complex c1)
    {
        r1=c1.r1;
        r2=c1.r2;
        i1=c1.i1;
        i2=c1.i2;
        real=r1+r2;
        img=i1+i2;
        System.out.println("\nc1 = "+r1+"+i"+i1);
        System.out.println("\nc2 = "+r2+"+i"+i2);
        System.out.println("\nc1+c2 = "+real+"+i"+img);  

    }
    public void finalize()
    {
        System.out.println("\n DESTRUCTED");
    }
    public static void main(String args[])
    {

        complex c1 = new complex();
        Scanner s = new Scanner(System.in);
        System.out.println("\nPARAMETRIC  CONSTRUCTOR");
        System.out.println("\nenter real parts:");
        int r1 = s.nextInt();
        int r2 = s.nextInt();
        System.out.println("\nenter imaginary  parts:");
        int i1 = s.nextInt();
        int i2 = s.nextInt();
        complex c2 = new complex(r1,i1,r2,i2);
        System.out.println("\nCOPY CONSTRUCTOR");
        complex c3 = new complex(c1);
        complex d = new complex();
        d.finalize();
        d=null;
        System.gc();



    }

    
}
