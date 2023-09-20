package array;
import java.util.Scanner;
public class floatarray {
    public void flarr(){
        Scanner sc = new Scanner(System.in);
        float[] floatarr = new float[5];
        System.out.println("Enter the Float values;\t");
        for(int i=0;i<5;i++){
            floatarr[i] = sc.nextFloat();
        }
        System.out.println("Float Array:");
        for(int i=0;i<5;i++){
            System.out.println(floatarr[i]);
        }
    }
//    public static void main(String[] args){
//        floatarray arr = new floatarray();
//        arr.flarr();
//    }
}
