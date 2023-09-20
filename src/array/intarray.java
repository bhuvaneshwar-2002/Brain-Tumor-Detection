package array;
import java.util.Scanner;
public class intarray {
    public void integer(){
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[5];
        System.out.println("Enter the Integer:");
        for(int i=0;i<5;i++){
            intArray[i]= sc.nextInt();
        }
        System.out.println("Integer Array:");
        for(int i=0;i<5;i++){
            System.out.println(intArray[i]);
        }
    }
//    public static void main(String[] args){
//        intarray array = new intarray();
//        array.integer();
//    }
}
