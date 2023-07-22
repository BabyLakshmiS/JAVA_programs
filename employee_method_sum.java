package batchtest;
import java.util.*;
public class employee_method_sum {
	void main(int salary,int hours)
	{
	salary=hours*5;
	System.out.println("salary is"+salary);
	}
}
class get_info{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	int hours=sc.nextInt();
	employee_method_sum details=new employee_method_sum();
	//details.main(salary,hours);
    }
}