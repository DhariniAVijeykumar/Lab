import java.util.*;
public class shape
{
public static void main(String[] args) {
square obj1=new square();
rectangle obj=new rectangle();
obj1.findarea(obj1.side);
obj.findarea(obj.length,obj.breadth);
}
}
class square{
int side;
square()
{
side=5;
}
void findarea(int side)
{
int area;
area=side*side;
System.out.println();
System.out.println(" AREA OF SQUARE=" + area + "cm");
System.out.println("\n\n");
}
}
class rectangle{
int length;
int breadth;
rectangle()
{
length=4;
breadth=5;
}
void findarea(int length,int breadth)
{
int area;
area=length*breadth;
System.out.println();
System.out.println(" AREA OF RECTANGLE=" + area + "cm");