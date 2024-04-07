package employees;
public class Employee {
    
    private String fullName;
    private double salary;

    // Konstruktor
    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    // Pobieranie pełnej nazwy pracownika
    public String getFullName() {
        return fullName;
    }

    // Pobieranie wynagrodzenia pracownika
    public double getSalary() {
        return salary;
    }

    // Ustawianie nowego wynagrodzenia pracownika
    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    // Reprezentacja tekstowa obiektu
    @Override
    public String toString() {
        return "Employee: " + fullName + ", Salary: " + salary;
    }
}
