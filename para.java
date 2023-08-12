import java.util.*;
public class para{
    public static void swapv(int a,int b){
        int t1;
        t1=a;
        a=b;
        b=t1;
    }
    public static void swapf(final int x,final int y){
        int t2;
        t2=x;
        x=y;
        y=t2;
    }

    public static void main(String[] args){
        int a,b;
        final int x = 12;
        final int y =8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
         a = sc.nextInt();
         b = sc.nextInt();
        para c = new para();
        System.out.println("Before Swaping ");
        System.out.println("a ="+ a + " b ="+b);
        c.swapv(a,b);
        c.swapf(x,y);
        System.out.println("After swaping:");
        System.out.println(" a ="+ a + " b ="+b);
        System.out.println("x = "+ x + " y = "+ y );

    }

    
}
