package objects;

public class Employee {
    private int empId;
    private double salary;
    private String position;

    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
}
