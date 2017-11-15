public class EmployeeInfo {

	// Attributes
	protected int empNum; // employee number, to be used for the hash table
	protected String firstName; // first Name
	protected String lastName; // last Name
	protected int sex; // encode e.g. 0 for M, 1 for F, etc.
	protected int workLoc; // encode e.g. 0 for Mississauga, 1 for Toronto, 2
							// for
							// Windsor, 3 for Montreal etc.
	protected double deductRate; // e.g. 0.21 for 21%

	// Constructors
	public EmployeeInfo() {
		empNum = -1;
		firstName = null;
		lastName = null;
		sex = -1;
		workLoc = -1;
		deductRate = 0.21;
	}

	public EmployeeInfo(int empNum, String firstName, String lastName, int sex,
			int workLoc, double deductRate) {
		this.empNum = empNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.workLoc = workLoc;
		this.deductRate = deductRate;
	}

	// Methods
	// Getters and Setters

	/**
	 * @return the empNum
	 */
	public int getEmpNum() {
		return empNum;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the sex
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * @return the workLoc
	 */
	public int getWorkLoc() {
		return workLoc;
	}

	/**
	 * @return the deductRate
	 */
	public double getDeductRate() {
		return deductRate;
	}

	/**
	 * @param empNum
	 *            the empNum to set
	 */
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * @param workLoc
	 *            the workLoc to set
	 */
	public void setWorkLoc(int workLoc) {
		this.workLoc = workLoc;
	}

	/**
	 * @param deductRate
	 *            the deductRate to set
	 */
	public void setDeductRate(double deductRate) {
		this.deductRate = deductRate;
	}

}