package batchtest;
import java.util.*;
class member
{
     String name;
     int age;
     String phoneNumber;
     String address;
     int salary;
     member(String name, int age, String phoneNumber, String address, int salary) 
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        
    }

    public void printSalary()
    {
        System.out.println(salary);
    }
}

 class Employee extends member
 {
    // String specialization;
     Employee(String name, int age, String phoneNumber, String address, int salary, String specialization) 
    {
        super(name, age, phoneNumber, address, salary);
      //  this.specialization = specialization;
    }
}

 class Manager extends member
{
  //   String department;
     Manager(String name, int age, String phoneNumber, String address, int salary, String department) 
    {
        super(name, age, phoneNumber, address, salary);
     //   this.department = department;
    }
}

public class manager_employe_inheritance 
{
    public static void main(String[] args)
    {
        Employee employee = new Employee("baby", 25, "12345", "venus", 10000, "ECE");
        Manager manager = new Manager("lakshmi", 30, "67890", "Earth", 50000, "ECE");
        System.out.println("employee salary is  ");
        employee.printSalary();
        System.out.println("manager salary is  ");
        manager.printSalary();
    }
}