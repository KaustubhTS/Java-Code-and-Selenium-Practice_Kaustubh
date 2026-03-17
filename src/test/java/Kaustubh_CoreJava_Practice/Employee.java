package Kaustubh_CoreJava_Practice;

public class Employee {
	// Step 1: Declare private fields
	private int empID;
	private String empName;

	// Step 2: Constructor to initialize Employee object
	public Employee(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
	}

	// Step 3: Override equals() method to compare values
	@Override
	public boolean equals(Object obj) {
		// Check if both references point to the same object
		if (this == obj)
			return true;
		// Check if obj is an instance of Employee
		if (obj == null || getClass() != obj.getClass())
			return false;
		// Typecast obj to Employee to compare data members String
		Employee other = (Employee) obj;
		// Compare empID and empName
		return this.empID == other.empID && (this.empName != null && this.empName.equals(other.empName));
	}

	@Override
	public int hashCode() {
		return empID * 31 + empName.hashCode();
	}

	// Optional: Override toString() for better output
	@Override
	public String toString() {
		return "Employee [ID=" + empID + ", Name=" + empName + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101, "John");
		Employee emp2 = new Employee(101, "John");
		Employee emp3 = new Employee(102, "Mike");
		// Step 5: Compare using equals()
		System.out.println("emp1.equals(emp2): " + emp1.equals(emp2)); // true
		System.out.println("emp1.equals(emp3): " + emp1.equals(emp3)); // false
		System.out.println(emp1.hashCode() == emp2.hashCode());
	}
}