package Employee;

public class Manager extends Employee implements Training, Interview {


    public Manager(String name, String department) {
        super(name, department);
    }

    @Override
    public void attendTraining() {
        System.out.println("Employee.attendTraining Employee.Manager-> "+getName()+" " +getDepartment());
    }

    @Override
    public void conductInterview() {
        System.out.println("Employee.conductInterview Employee.Manager-> "+getName()+" " +getDepartment());
    }
}
