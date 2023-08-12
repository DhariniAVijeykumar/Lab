import java.util.*;
 public class Str{
     String s1,s2,s3,s4,s5;
     int n1,n2;
     public static void str_cat(String s1,String s2){
         s1= s1.concat(s2);
         System.out.println("\nafter concatenation:"+s1);
     }
     public static void str_cat(String s1,String s2,String s3){
         String s4 = s1.concat(s2);
         s4 = s4.concat(s3);
         System.out.println("\nAfter concatenation of 3 strings:"+s4);
     }
     public static void str_cat(String s1,String s2,int n1){
        s1 = s1.concat(s2.substring(0,n1));
        System.out.println("\nafter concatenation with respect to index:"+s1);  
     }

     public static void str_cpy(String s1){
         String s5 = s1;
         System.out.println(" \ninput string : "+s1+"\ncopied string is :"+s5);
     }
     public static void str_cpy(String s1,String s2){
         String s6= s1;
         String s7 = s2;
         System.out.println("\ninput strings : "+ s1 + s2 +"\ncopied strings:"+ s6 + s7);
         
     }
     public static void str_cpy(String s1,int n2)
     {
        String s8= s1.substring(0,n2);
        System.out.println("\nafter cpoying with respect to index:"+s8); 
     }
     public static void main(String[] args){
         System.out.println("enter 3 strings:");
         Scanner sc = new Scanner(System.in);
         String s1= sc.nextLine();
         String s2 = sc.nextLine();
         String s3 = sc.nextLine();
         System.out.println("\nenter the no of characters you want to concatenate:");
         int n1= sc.nextInt();
         System.out.println("\nenter the no of characters you want to copy:");
         int n2= sc.nextInt();
         str_cat(s1,s2);
         str_cat(s1,s2,s3);
         str_cat(s1,s2,n1);
         str_cpy(s1);
         str_cpy(s1,s2);
         str_cpy(s1,n2);
     }
 }

