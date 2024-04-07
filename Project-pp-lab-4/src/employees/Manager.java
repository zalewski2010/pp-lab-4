package employees;

public class Manager extends Employee {
    public int numberOfSubordinates;

    public Manager(String fullName, double salary) {
        super(fullName, salary);
        this.numberOfSubordinates = 0; // Domyślnie
    }


    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public String toString() {
        return "Manager: " + getFullName() + ", Salary: " + getSalary() + ", Subordinates: " + numberOfSubordinates;
    }
}
