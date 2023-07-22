package batchtest;
import java.util.*;
abstract class shape
{
 int x,y;
 abstract void area(double x,double y);
}

class Rectangle extends shape
{
  void area(double x,double y)
  {
   System.out.println("Area of rectangle is :"+(x*y));
  }
}
class Circle extends shape
{
  void area(double x,double y)
   {
     System.out.println("Area of circle is :"+(3.14*x*x));
   }
}
class Triangle extends shape
{
  void area(double x,double y)
   {
     System.out.println("Area of triangle is :"+(0.5*x*y));
   }
}
public class abstract_class
{
public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
   Rectangle r=new Rectangle();
   r.area(x,y);
   Circle c=new Circle();
   c.area(x,y);
   Triangle t=new Triangle();
   t.area(x,y);
}
}