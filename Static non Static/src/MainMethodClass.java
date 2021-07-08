
public class MainMethodClass {

	void display(String[] arr) {
		System.out.println("display");
	}

	public static void main(String[] args) {
		MainMethodClass m = new MainMethodClass();
		// String[] args;
		m.display(args);
	}

}
