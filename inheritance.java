package NIGHTCLS;
import java.io.*;
import java.util.*;
class Quadrilateral
{
void area()
{
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int b=s.nextInt();
int h=s.nextInt();
}
}
class Squre extends Quadrilateral
{
void Squrearea()
{
int l=5;
int s=l*l;
System.out.println("area of sruare is "+s);
}
}
class rectangle extends Quadrilateral
{
void rectanglearea()
{
	int l=3;
	int b=2;
	int h=2;
	int r=l*b*h;
System.out.println("area of rectangle is "+r);
}
}
class parlalogram extends Quadrilateral
{
void trianglearea()
{
	int b=3;
	int h=5;
	int p=b*h;
System.out.println("area of triangle is "+p);
}
}

class inheritance
{
public static void main(String args[])
{
 Squre s=new Squre();
 rectangle R=new rectangle();
 parlalogram P=new parlalogram();
s.Squrearea();
R.rectanglearea();
P.trianglearea();

}
}