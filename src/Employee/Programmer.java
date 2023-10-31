package Employee;

public class Programmer extends Employee  {

    public Programmer(String name, String department) {
        super(name, department);
    }

    @Override
    public void attendTraining() {
        System.out.println("Employee.attendTraining Employee.Programmer-> "+getName()+" " +getDepartment());
    }
}
