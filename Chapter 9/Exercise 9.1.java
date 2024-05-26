public class Marketer extends Employee {
	public double getSalary() {
		return super.getSalary() + 10000.0;
	}
    
    public static void advertise() {
        System.out.println("Act now, while supplies last!");
    }
}