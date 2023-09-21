package abstraction;

public class Student implements Studentinterface {
    private String stdName;
    private int stdAge;
    private int stdId;
    @Override
    public String getName() {
        return stdName;
    }

    @Override
    public int getAge() {
        return stdAge;
    }

    @Override
    public int getId() {
        return stdId;
    }

    @Override
    public void setName(String name) {
        this.stdName = name;
    }

    @Override
    public void setAge(int age) {
        this.stdAge = age;
    }

    @Override
    public void setId(int id) {
        this.stdId = id;
    }
}

