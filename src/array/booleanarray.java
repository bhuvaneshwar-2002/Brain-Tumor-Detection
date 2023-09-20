package array;
import java.util.Scanner;
public class booleanarray {
    public void booleanarr(){
        Scanner sc= new Scanner(System.in);
        boolean[] booleanArray = new boolean[5];
        System.out.println("Enter the Boolean Values:");
        for(int i=0;i<5;i++){
            booleanArray[i] =sc.nextBoolean();
        }
        System.out.println("Boolean Array");
        for(int i=0;i<5;i++){
            System.out.println(booleanArray[i]);
        }
    }
}
