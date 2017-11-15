public class FullTimeEmployee extends EmployeeInfo {

	// Attributes
	private double yearlySalary;

	// Constructors
	public FullTimeEmployee(int empNum, String firstName, String lastName,
			int sex, int workLoc, double deductRate, double yearlySalary) {
		super(empNum, firstName, lastName, sex, workLoc, deductRate);
		this.yearlySalary = yearlySalary;
	}

	// Methods

	// Getters and Setters
	/**
	 * @return the yearlySalary
	 */
	public double getYearlySalary() {
		return yearlySalary;
	}

	/**
	 * @param yearlySalary
	 *            the yearlySalary to set
	 */
	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	// Actual Methods
	public double calcGrossAnnualIncome() {
		return (yearlySalary);
	}

	public double calcNetAnnualIncome() {
		return (yearlySalary * (1 - deductRate));
	}
}
