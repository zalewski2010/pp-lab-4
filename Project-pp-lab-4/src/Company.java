import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        // Utworzenie tablicy pracowników
        Employee[] employees = new Employee[5];

        // Dodanie pracowników do tablicy
        employees[0] = new Manager("John Doe", 4500.0);
        employees[1] = new Worker("Mike Joe", 5000.0);
        employees[2] = new Employee("Adam Adamski", 6000.0);
        employees[3] = new Employee("Monika Kowalska", 7000.0);
        employees[4] = new Worker("Agata Lindstrom", 8000.0);

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // dane index 3
        System.out.println("Before:");
        System.out.println(employees[3]);

        // Modyfikacja  indeksu 3
        employees[3].setSalary(10000.0);

        
        System.out.println("After changing:");
        System.out.println(employees[3]);

        // wszyscy pracownicy
        System.out.println("\nLista wszystkich pracowników:");
        for(Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
