package example;

public class Main{
    public static void main(String[] args){

        student st = new student();

        st.setId(2);
        st.setName("bhuvi");
        st.setDob("01-08-2002");
        st.setDepartment("Information Technology");

        int id = st.getId();
        String name = st.getName();
        String dob = st.getDob();
        String department = st.getDepartment();

        System.out.println(id);
        System.out.println(name);
        System.out.println(dob);
        System.out.println(department);

    }
}