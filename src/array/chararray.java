package array;
import java.util.Scanner;
public class chararray {
    public void character() {
        Scanner sc = new Scanner(System.in);
        char[] charArray = new char[5];
        System.out.println("Enter the Character:");
        for(int i=0;i<5;i++){
            charArray[i] = sc.next().charAt(0);
        }
        System.out.println("Character Array:");
        for(int i=0;i<5;i++){
            System.out.println(charArray[i]);
        }
    }

//    public static void main(String[] args){
//        chararray type2 = new chararray();
//        type2.character();
//    }
}
