package Employee;

public class Employee implements Training {

    private String name;
    private String department;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    @Override
public void attendTraining(){
    System.out.println("Attend Training Employee");
}

}
