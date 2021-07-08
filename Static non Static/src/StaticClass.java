
public class StaticClass {

	public StaticClass(String name) {
		super();
		this.name = name;
		System.out.println(name);
	}

	static int value = 10;
	String name = "765874656";
	int x = Integer.parseInt(name);

	void display() {
		System.out.println(name);

	}

	static {
		System.out.println(value);
		// System.out.println(name); we cant access the non static data inside static
		// block.
	}
	// init block
	{
		System.out.println("this is initializer");
	}

	static int show() {
		obj1.display();
		return value;

	}

	static StaticClass obj1 = new StaticClass("vipro");

	public static void main(String[] args) {
		StaticClass obj = new StaticClass("Accenture");

		obj.display();

	}

}
