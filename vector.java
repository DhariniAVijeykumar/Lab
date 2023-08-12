import java.util.*;
public class vector{
    
    vector()
    {
      Vector<Integer> v1= new Vector<>();
      v1.add(8);
      v1.add(7);
      v1.add(2);
      v1.add(0);
      v1.add(3);
      System.out.println("elements of vector : "+v1);
      Collections.sort(v1);
      System.out.println("Sorted vector : "+v1);
    }
    vector(Vector <Integer>v2,int n){
      System.out.println("elements of vector : "+v2);
      Collections.sort(v2);
      System.out.println("Sorted vector:"+v2);
        
    }
    vector(vector vec2){
      System.out.println("COPY CONSTRUCTOR");
    }
    public void finalize()
    {
        System.out.println("\n DESTRUCTED");
    }
    public static void main(String args[]){
        vector vec1 = new vector();
        Scanner s = new Scanner(System.in);
        System.out.println("\n enter the size of vector:");
        int n = s.nextInt();
        Vector<Integer> v2 = new Vector<Integer>(n);
        System.out.println("\n enter the elements of vector:");
        for(int i=0;i<n;i++){
          v2.add(s.nextInt());
        }
        vector vec2 = new vector(v2,n);
        vector vec3 = new vector(vec2);
        vector d = new vector();
        d.finalize();
        vec1 = null;
        vec2 = null;
        vec3 = null;
        System.gc();
    }
    
}
