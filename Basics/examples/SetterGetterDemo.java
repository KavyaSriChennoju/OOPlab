class Student {
	private int number = 9001;
	private String name = "baig";

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printStudent() {
		System.out.println("Number is..." + number);
		System.out.println("Name is..." + name);
	}
}

public class SetterGetterDemo {
	public static void main(String[] args) {
		Student st = new Student();
		st.printStudent();

		st.setNumber(4005);
		st.setName("suma");

		// st.printStudent();
		System.out.println("name is.." + st.getName());
	System.out.println("Number is..." + st.getNumber());
	}

}
