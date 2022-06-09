package Demo1;
import java.util.ArrayList;
public class SalaryBasedSort {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employeeList=new ArrayList<>();
		Employee e1=new Employee("a",10000D);
		Employee e2=new Employee("b",40000D);
		Employee e3=new Employee("c",30000D);
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		
		employeeList.stream().sorted((Employee em1,Employee em2)->em1.salary.compareTo(em2.salary)).forEach(
			emp->System.out.println(emp)); //simply printing the output without
	}
}
class Employee 
//implements Comparable<Employee>
{
	 String name;
 Double salary;
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return o.salary.compareTo(this.salary); //descending order and most suitable way
//		//return (int) (o.salary-this.salary); //desceding order and gave the same output as above
//	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}