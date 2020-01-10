package profit;

import java.util.Scanner;
import java.util.ArrayList;

public class profitDemo {

	public static void main(String[] args) {
		
		ArrayList<Employees> em =new ArrayList<Employees>();
		ArrayList<Salary> s =new ArrayList<Salary>();
	
		
		Scanner input =new Scanner (System.in);
		char ch;
		do {
			System.out.println("Enter employeesID :");
			String id=input.next();
			System.out.println("Enter employees name :");
			String name=input.next();
			System.out.println("Enter salary");
			double money =input.nextInt();
			em.add(new Employees(name,id));
			s.add(new Salary(money));
			System.out.println("Do you want enter again [y/n]");
			ch = input.next().charAt(0);
			}while(ch=='y');
		for(int i=0;i<em.size();i++) {
			em.get(i).setSalary(s.get(i));
		}
			
	}

}
