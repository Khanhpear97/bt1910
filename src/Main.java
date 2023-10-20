import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Employee's name: ");
        String name = scanner.nextLine();
        System.out.println("Employee's id: ");
        String id = scanner.nextLine();
        System.out.println("Work time per month: ");
        int workingHour = scanner.nextInt();
        System.out.println("Basic salary: ");
        int basicSalaryPerHour = scanner.nextInt();
        System.out.println("Overtime: ");
        int overtimeHour = scanner.nextInt();
        System.out.println("Overtime salary: ");
        int overtimeSalaryPerHour = scanner.nextInt();

        Employee employee = new Employee(name, id, workingHour, basicSalaryPerHour, overtimeHour, overtimeSalaryPerHour);
        System.out.println(employee.getInfo());
    }
}