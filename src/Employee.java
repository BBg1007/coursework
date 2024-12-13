import java.util.Objects;

public class Employee {
    private final String name;
    private int salary;
    private int department;
    private final int id;
    private static int counter;

    public Employee (String name,int department,int salary) {
        this.id=++counter;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department){
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override

    public String toString() {
        return "Ф.И.О: "+this.getName()+" Отдел № "+this.getDepartment()+" Зарплата: "+this.getSalary()+" Id: "+this.getId();
    }
}
