package profit;

import java.util.Scanner;

public class profitDemo {

	public static void main(String[] args) {
		Arraylist<Employees> em =new Arraylist<Employees>();
		Arraylist<Salary> s =new Arraylist<Salary>();
		Scanner input =new Scanner (System.in);
		do {
			System.out.println("Enter employeesID :");
			String id=input.next();
			System.out.println("Enter employees name :");
			String name=input.next();
			System.out.println("Enter salary");
			double money =input.nextInt();
			em.add(new Employees(name,id));
			s.add(new Salary(sa));
			System.out.println("Do you want enter again [y/n]");
			char ch =input.next().charAt(0);
			}while(ch=='y');
		for(int i=0;i<em.size();i++) {
			em[i].setSalary(s[i]);
		}
			
	}

}
