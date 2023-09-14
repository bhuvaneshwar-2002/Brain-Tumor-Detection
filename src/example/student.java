package example;

public class student{
    private int id;
    private String name;
    private String dob;
    private String department;

    //Id
    public int getId(){

        return id;
    }
    public void setId(int id){

        this.id = id;
    }

    //name
    public String getName(){

        return name;
    }
    public void setName(String name){

        this.name =name;
    }

    //dob
    public String getDob(){

        return dob;
    }
    public void setDob(String dob){
        this.dob = dob;
    }

    //email
    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }
}