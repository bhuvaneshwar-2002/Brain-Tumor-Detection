package abstraction;

public class Employee implements Studentinterface {
    private String empName;
    private int empId;
    private int empAge;
    @Override
    public String getName() {
        return empName;
    }

    @Override
    public int getAge() {
        return empAge;
    }

    @Override
    public int getId() {
        return empId;
    }

    @Override
    public void setName(String name) {
        this.empName = name;
    }

    @Override
    public void setAge(int age) {
        this.empAge = age;
    }

    @Override
    public void setId(int id) {
        this.empId = id;
    }
}
