
import java.util.ArrayList;

public class MyHashTable {

    // ATTRIBUTES
    // buckets is an array of ArrayList. Each item in an ArrayList is an
    // EmployeeInfo object.
    private ArrayList<EmployeeInfo>[] buckets;
    private int employeeCount;
    private double yearlyPayroll;
    
    public int getEmployeeCount(){
        return employeeCount;
    }
    public double getYearlyPayroll(){
        return yearlyPayroll;
    }
    
    // CONSTRUCTOR
    public MyHashTable(int howManyBuckets) {
        // Construct the hash table (open hashing/closed addressing) as an array
        // of howManyBuckets ArrayLists.

        // Instantiate an array to have an ArrayList as each element of the
        // array.
        buckets = new ArrayList[howManyBuckets]; // What about line 9?
        employeeCount = 0;
        // For each element in the array, instantiate its ArrayList.
        for (int i = 0; i < howManyBuckets; i++) {
            buckets[i] = new ArrayList(); // Instantiate the ArrayList for
            // bucket i.
        }
    }

    // METHODS
    // Getters and Setters
    /**
     * @return the buckets
     */
    public ArrayList<EmployeeInfo>[] getBuckets() {
        return buckets;
    }

    public int calcBucket(int keyValue) {
        // Returns the bucket number as the integer keyValue modulo the number
        // of buckets for the hash table.
        return (keyValue % buckets.length);
    }

    public boolean addEmployee(EmployeeInfo theEmployee) {
        // Add the employee to the hash table. Return true if employee is added
        // successfully, return false otherwise

        // If the employee number is negative one, it will not be able to add it
        // to the array.
        if (theEmployee.getEmpNum() == -1) {
            return false;
        }

        // Add the employee to the array based on the calcBucket result
        buckets[calcBucket(theEmployee.getEmpNum())].add(theEmployee);

        // Increase tally of number of employees
        employeeCount++;
        
        if (theEmployee instanceof FullTimeEmployee) {
            FullTimeEmployee theFTEmployee = (FullTimeEmployee) theEmployee;
            yearlyPayroll += theFTEmployee.calcGrossAnnualIncome();
        } else {
            PartTimeEmployee thePTEmployee = (PartTimeEmployee) theEmployee;
            yearlyPayroll += thePTEmployee.calcGrossAnnualIncome();
        }
        
        // Search for the employee number in the array to confirm it has been
        // added.
        if (searchByEmployeeNumber(theEmployee.getEmpNum()) == theEmployee
                .getEmpNum()) {
            return true;
        } else {
            return false;
        }
       
    }

    public int searchByEmployeeNumber(int employeeNum) {
        // Determine the position of the employee in the ArrayList for the
        // bucket that employee hashes to.
        // If the employee is not found, return -1.
        for (int j = 0; j < buckets.length; j++) {
            for (int k = 0; k < buckets[j].size(); k++) {
                if (buckets[j].get(k).getEmpNum() != employeeNum) {
                    continue;
                } else {
                    return buckets[j].indexOf(buckets[j].get(k));
                } // end else
            } // end for
        } // end for
        return -1;
    } // end method searchByEmployeeNumber

    public EmployeeInfo removeEmployee(int employeeNum) {
        // Remove the employee from the hash table and return the reference to
        // that employee. If the employee is not in the hash table, return null.
        int theBucket = calcBucket(employeeNum);
        for (int m = 0; m < buckets[theBucket].size(); m++) {
            if (buckets[theBucket].get(m).getEmpNum() != employeeNum) {
                continue;
            } else {
                EmployeeInfo removed = buckets[theBucket].get(m);
                buckets[theBucket].remove(m);
                // Decrease the tally of number of employees
                employeeCount--;
                return removed;
            }
        }
       
        return null;

    }

    public EmployeeInfo getEmployee(int empNum) {
        // Retrieve an employee's information by searching their employee number
        int bucketPosition = calcBucket(empNum);
        int arraylistPosition = searchByEmployeeNumber(empNum);
        EmployeeInfo theEmp = buckets[bucketPosition].get(arraylistPosition);
        return theEmp;
    }

    public void displayContents() {
        // Print the employee numbers for the employees stored in each bucket's
        // ArrayList, starting with bucket 0, then bucket 1, and so on.

        for (int i = 0; i < buckets.length; i++) {

            // For the current bucket, print out the emp num for each item in
            // its ArrayList.

            System.out.println("\nExamining the ArrayList for bucket " + i);
            int listSize = buckets[i].size();
            if (listSize == 0) {
                System.out.println("  Nothing in its ArrayList!");
            } else {
                for (int j = 0; j < listSize; j++) {
                    int theEmpNum = buckets[i].get(j).getEmpNum();
                    System.out.println("  Employee " + theEmpNum);
                } // end for

            } // end else

        } // end for

    } // end method displayContents

    public String[][] exportContents() {
        // Returns an two dimensional array with employee numbers and their information
        // To be used with the table in the view all jframe
        
        // A counter to determine the number of rows we need
        int employeesAdded = 0;
        
        // Create the two dimensional array to be returned, employee count is the number of employees, 6 is number of infos
        String[][] allEmployees = new String[employeeCount][6];

        // go through the hashtable
        for (int i = 0; i < buckets.length; i++) {
            int listSize = buckets[i].size();
            if (listSize == 0) {
            } else {
                for (int j = 0; j < listSize; j++) {
                    EmployeeInfo theEmp = buckets[i].get(j);
                    allEmployees[employeesAdded][0] = Integer.toString(theEmp.getEmpNum());
                    allEmployees[employeesAdded][1] = theEmp.getFirstName();
                    allEmployees[employeesAdded][2] = theEmp.getLastName();
                    allEmployees[employeesAdded][3] = Integer.toString(theEmp.getSex());
                    allEmployees[employeesAdded][4] = Integer.toString(theEmp.getWorkLoc());
                    allEmployees[employeesAdded][5] = Double.toString(theEmp.getDeductRate());
                    employeesAdded++;
                } // end for

            } // end else

        } // end for
        return allEmployees;
    } // end method exportContents
} // end class MyHashTable
