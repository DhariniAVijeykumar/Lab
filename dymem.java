import java.util.*;
public class dymem{ 

    public static void main(String args[]){
        int i,j;
        Scanner s = new Scanner(System.in);
        int a[] = new int[3];
        System.out.println("\nEnter the array of integers:");
        for(i=0;i<3;i++){
            a[i]= s.nextInt();
       }
       System.out.print("\n array  of integers = ");
       for(i=0;i<3;i++){
        System.out.println(a[i]);
       }
       for(i=0;i<3;i++){
        a[i]='\0';
       }
       System.out.println("\nAfter Deallocation , array of integers = ");
       for(i=0;i<3;i++){
        System.out.println(a[i]);
       }
       float f[] = new float[3];
       System.out.println("\nEnter the array of float values:");
        for(j=0;j<3;j++){
            f[j]= s.nextFloat();
       }
       System.out.print("\n array of float values  = ");
       for(j=0;j<3;j++){
        System.out.println(f[j]);
       }
       for(j=0;j<3;j++){
        f[j]='\0';
       }
       System.out.println("\nAfter Deallocation, array of float values = ");
       for(j=0;j<3;j++){
        System.out.println(f[j]);
       }
       System.out.println("\n Enter a character:");
       char d = s.next().charAt(0);
       Character c = new Character(d);
       System.out.println(" Char = "+c);
       c = ' ';
       System.out.println("After deallocation, Char = "+c);
       System.out.println("\n Enter a string:");
       String s1 = s.next();
       StringBuffer s2 = new StringBuffer(s1);
       System.out.println("string="+s2);
       int n = s2.length();
       s2 = s2.delete(0,n);
       System.out.println("\nAfter deallocation string = "+s2);


                      
    }

    
}
