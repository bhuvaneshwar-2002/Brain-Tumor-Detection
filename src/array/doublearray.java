package array;
import java.util.Scanner;
public class doublearray {
    public void darray() {
        Scanner sc = new Scanner(System.in);
        double[] doublearr = new double[5];
        int i;
        System.out.println("Enter the Double array:");
        for(i=0;i<5;i++){
            doublearr[i] = sc.nextDouble();
        }
        System.out.println("Double Array:");
        for(i=0;i<5;i++){
            System.out.println(doublearr[i]);
        }
    }
}
