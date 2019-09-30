package pp;

import java.util.*;

public class EmpCollection {
	ArrayList r=new ArrayList();;
	Emp e;
	
	public void add() {
	    e=new Emp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmpId:");
		e.empId=sc.next();
		System.out.println("Enter Name:");
			e.name=sc.next();
			System.out.println("Enter Salary");
			e.salary=sc.nextFloat();
	
			char c;
			do {System.out.println("Enter Mobile No:");
				e.mobile.add(sc.next());
				System.out.println("Add another mobile(y/n):");
				c=sc.next().charAt(0);
			} while (c=='y');
		r.add(e);
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Emplyoee Details:");
		for (int i = 0; i < r.size(); i++) {
			e=(Emp) r.get(i);
			System.out.println("Emp Id:"+e.empId);
			System.out.println("Emp Name:"+e.name);
			System.out.println("Emp Mobile"+e.mobile);
			System.out.println("emp Salay:"+e.salary);
			System.out.println("***********************************");
		}


	}
	public static void main(String[] args) {
		EmpCollection x=new EmpCollection();
		char c;int op;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.add");
			System.out.println("2.display");
			System.out.println("3.Update salary");
			System.out.println("Enter option:");
			op=sc.nextInt();
			
			switch (op) {
			    case 1:x.add();	break ;

			    case 2:x.display();break;
			    case 3:x.updateSalaryemp();break;
				
			}
			System.out.println("continue...(y/n)");
			c=sc.next().charAt(0);
			
		} while (c=='y');
			}
	
	
	public void updateSalaryemp() {
		
		for (int i = 0; i < r.size(); i++) {
			e=(Emp) r.get(i);
			if(e.salary<10000)
				e.salary=e.salary+(e.salary/10);
			if(e.salary>70000)
				r.remove(e);
			
		}
		// TODO Auto-generated method stub
		System.out.println("updated...");
	}

}
