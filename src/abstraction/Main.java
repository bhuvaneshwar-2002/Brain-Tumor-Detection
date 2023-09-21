package abstraction;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Student student1 = new Student();
        Student[] students = new Student[2];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();

            System.out.print("Enter Student " + (i + 1) + " Name: ");
            String studentName = sc.nextLine();
            students[i].setName(studentName);

            System.out.print("Enter Student " + (i + 1) + " Age: ");
            int studentAge = Integer.parseInt(sc.nextLine());
            students[i].setAge(studentAge);

            System.out.print("Enter Student " + (i + 1) + " Id: ");
            int studentId = Integer.parseInt(sc.nextLine());
            students[i].setId(studentId);

        }
//        student1.setName("Bhuvi");
//        student1.setAge(21);
//        student1.setId(8);
//        students[0] = student1;
//        Student student2 = new Student();
//        student2.setName("Vicky");
//        student2.setAge(21);
//        student2.setId(7);
//        students[1] = student2;
        for (int i=0; i<students.length;i++){
            System.out.println("Student - " +(i + 1) +":");
            System.out.print("Student Name:"+students[i].getName()+'\t');
            System.out.print("Student Age:"+students[i].getAge()+'\t');
            System.out.println("Student Id:"+students[i].getId()+'\t');
        }

        Employee[] employees = new Employee[1];
        Employee employee1 = new Employee();
        employee1.setName("Bhuvi");
        employee1.setAge(25);
        employee1.setId(12);
        employees[0] = employee1;
        for (Employee employee : employees) {
            System.out.println("Employee Name:" + employee.getName());
            System.out.println("Employee Age:" + employee.getAge());
            System.out.println("Employee Id:" + employee.getId());
        }
    }
}
