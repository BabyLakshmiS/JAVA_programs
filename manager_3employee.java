package batchtest;
import java.util.*;
class employee
{
     String name;
     int age;
     int year;
     String phoneNumber;
     String address;
     int salary;
     employee(String name, int age,int year, String phoneNumber, String address, int salary) 
    {
        this.name = name;
        this.age = age;
        this.year = year;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        
    }
     void printdetails()
     {
         System.out.print(name+" ");
         System.out.print(year+" ");
         System.out.print(address+" ");
     }
 }

class Employee1 extends employee
{
    Employee1(String name, int age, int year,String phoneNumber, String address, int salary) 
   {
       super(name, age, year,phoneNumber, address, salary);
   }
}
class Employee2 extends employee
{
    Employee2(String name, int age, int year,String phoneNumber, String address, int salary) 
   {
       super(name, age, year,phoneNumber, address, salary);
   }
}
class Employee3 extends employee
{
    Employee3(String name, int age, int year,String phoneNumber, String address, int salary) 
   {
       super(name, age, year,phoneNumber, address, salary);
   }
}
 class manager_3employee 
{
    public static void main(String[] args)
    {
    	Employee1 E1  = new Employee1("robert", 25, 1994, "12345", "tiruppur", 10000);
    	Employee2 E2  = new Employee2("sam", 25, 2000, "12345", "erode", 10000);
    	Employee3 E3  = new Employee3("john", 25, 1999, "12345", "chennai", 10000);
        System.out.println("employee1 details is  ");
        E1.printdetails();
        System.out.println(" \n\nemployee2 details is  ");
        E2.printdetails();
        System.out.println(" \n\nemployee3 details is  ");
        E3.printdetails();
       
    }
}

