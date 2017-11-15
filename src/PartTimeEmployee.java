public class PartTimeEmployee extends EmployeeInfo {

	// Attributes
	private double hourlyWage;
	private double hoursPerWeek;
	private int weeksPerYear;

	// Constructors
	public PartTimeEmployee(int empNum, String firstName, String lastName,
			int sex, int workLoc, double deductRate, double hourlyWage,
			double hoursPerWeek, int weeksPerYear) {
		super(empNum, firstName, lastName, sex, workLoc, deductRate);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
		this.weeksPerYear = weeksPerYear;
	}

	// Methods
	// Getters and Setters
	/**
	 * @return the hourlyWage
	 */
	public double getHourlyWage() {
		return hourlyWage;
	}

	/**
	 * @return the hoursPerWeek
	 */
	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

	/**
	 * @return the weeksPerYear
	 */
	public int getWeeksPerYear() {
		return weeksPerYear;
	}

	/**
	 * @param hourlyWage
	 *            the hourlyWage to set
	 */
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	/**
	 * @param hoursPerWeek
	 *            the hoursPerWeek to set
	 */
	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	/**
	 * @param weeksPerYear
	 *            the weeksPerYear to set
	 */
	public void setWeeksPerYear(int weeksPerYear) {
		this.weeksPerYear = weeksPerYear;
	}

	// Actual methods
	public double calcGrossAnnualIncome() {
		return (hourlyWage * hoursPerWeek * weeksPerYear);
	}

	public double calcNetAnnualIncome() {
		return (hourlyWage * hoursPerWeek * weeksPerYear * (1 - deductRate));
	}
}
