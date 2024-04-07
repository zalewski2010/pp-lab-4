import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        
        Employee[] employees = new Employee[5];

        
        employees[0] = new Manager("John Doe", 4500.0);
        employees[1] = new Worker("Mike Joe", 5000.0, "Developer");
        employees[2] = new Employee("Adam Adamski", 6000.0);
        employees[3] = new Employee("Monika Kowalska", 7000.0);
        employees[4] = new Worker("Agata Lindstrom", 8000.0,  "Graphic");

        
        // nowe salary zad 4
        for (Employee emp : employees) {
            emp.setSalary(emp.getSalary() + 500);
        }
        
        //  nie są instancją klasy Manager
        int nonManagerCount = 0;
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
            nonManagerCount++;
        System.out.println(emp);
            }
        }

        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                ((Manager)emp).setNumberOfSubordinates(nonManagerCount);
                emp.setSalary(7500.0);
            }
        }

        // Wyświetlenie zaktualizowanych informacji o pracownikach
        System.out.println("Zaktualizowane info o pracownikach:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        

        // Ustawienie liczby podwładnych i salary dla Managera (pracownik o indeksie 0)
        if (employees[0] instanceof Manager) {
            ((Manager)employees[0]).setNumberOfSubordinates(nonManagerCount);
            employees[0].setSalary(7500.0);
        }
        System.out.println("\nLiczba pracowników, którzy nie są managerami: " + nonManagerCount);
        
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
