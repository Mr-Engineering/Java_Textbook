package knou_javatextbook;

class Employee {
	int nSalary;
	String szDept = null;
	public void doJob() {System.out.println("Do Something");}
}

class Sales extends Employee {
	public Sales() {szDept = "Sales Dept";}
	public void doJob() {System.out.println("Do sales");}
}

class Development extends Employee {
	public Development() {szDept = "Development Dept";}
	public void doJob() {System.out.println("Do development");}
}
public class Company1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1, emp2;
		emp1 = new Sales();
		emp2 = new Development();
		emp1.doJob();
		emp2.doJob();
	}

}
