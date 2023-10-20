public class Employee {
    private String name;
    private String id;
    private int workingHour;
    private int basicSalaryPerHour;
    private int overtimeHour;
    private  int overtimeSalaryPerHour;

    public Employee() {
    }
    public Employee(String name, String id, int workingHour,
                    int basicSalaryPerHour, int overtimeHour, int overtimeSalaryPerHour) {
        this.name = name;
        this.id = id;
        this.workingHour = workingHour;
        this.basicSalaryPerHour = basicSalaryPerHour;
        this.overtimeHour = overtimeHour;
        this.overtimeSalaryPerHour = overtimeSalaryPerHour;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public int getBasicSalaryPerHour() {
        return basicSalaryPerHour;
    }

    public int getOvertimeHour() {
        return overtimeHour;
    }

    public int getOvertimeSalaryPerHour() {
        return overtimeSalaryPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public void setBasicSalaryPerHour(int basicSalaryPerHour) {
        this.basicSalaryPerHour = basicSalaryPerHour;
    }

    public void setOvertimeHour(int overtimeHour) {
        this.overtimeHour = overtimeHour;
    }

    public void setOvertimeSalaryPerHour(int overtimeSalaryPerHour) {
        this.overtimeSalaryPerHour = overtimeSalaryPerHour;
    }

    public int CalculateBasicSalary(){
        return  this.getWorkingHour() * this.getBasicSalaryPerHour();
    }

    public int CalculateOvertimeSalary(){
        return  this.getOvertimeHour() * this.getOvertimeSalaryPerHour();
    }

    public int TotalSalary(){
        return this.CalculateBasicSalary() + this.CalculateOvertimeSalary();
    }

    public String getInfo(){
        return "Employee Information: \n"
                +"Name: " + this.getName() + "\n"
                +"Id: " + this.getId() + "\n"
                +"Basic Salary: " + this.CalculateBasicSalary() + "\n"
                +"Overtime Salary: " + this.CalculateOvertimeSalary() + "\n"
                +"Total Salary: " + this.TotalSalary();
    }
}
