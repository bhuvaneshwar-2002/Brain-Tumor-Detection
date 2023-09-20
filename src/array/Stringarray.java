package array;
import java.util.Scanner;
public class Stringarray {
    public void str(){
        Scanner sc = new Scanner(System.in);
        String[] string = new String[5];
        System.out.println("Enter the Strings");
        for(int i=0;i<5;i++){
            string[i] = sc.nextLine();
        }
        System.out.println("String Array:");
        for(int i=0;i<5;i++){
            System.out.println(string[i]);
        }
    }
//    public static void main(String[] args){
//        Stringarray sa = new Stringarray();
//        sa.str();
//    }

}
