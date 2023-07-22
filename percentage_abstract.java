package batchtest;
import java.util.*;
 class percentage_abstract 
{

public static void main(String[] args) {

       A a = new A(10, 20, 30);
       System.out.println("Student A's percentage ");
       System.out.println(a.getPercentage());
       B b = new B(40, 50, 60, 70);
       System.out.println("Student B's percentage ");
       System.out.println(b.getPercentage());
}

}

abstract class  Marks 
{

   public abstract float getPercentage();

}

class A extends Marks{

   int mark1, mark2, mark3;

   A(int m1, int m2, int m3)
   {

       mark1=m1;

       mark2=m2;

       mark3=m3;

   }

   public float getPercentage(){

       float total=((mark1+mark2+mark3)/(float)300)*100;

       return total;

   }

}

class B extends Marks{

   int mark1, mark2, mark3, mark4;

   B(int m1, int m2, int m3, int m4){

       mark1=m1;

       mark2=m2;

       mark3=m3;

       mark4=m4;

   }

   public float getPercentage()
   {

       float total=((mark1+mark2+mark3+mark4)/(float)400)*100;

       return total;

   }

}