class Employee {
	int eid;
	String ename;

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

}

public class MainClass {
	public static void swap(Employee A, Employee B) {
		Employee temp = A;
		A = B;
		B = temp;
	}

	public static void main(String args[]) {
		Employee emp = new Employee(1, "Sohail");
		Employee emp1 = new Employee(2, "Aman");
		swap(emp, emp1);
		System.out.println(emp.eid + " " + emp.ename);
		System.out.println(emp1.eid + " " + emp1.ename);

	}

}
