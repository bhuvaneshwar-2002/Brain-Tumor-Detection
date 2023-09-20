package array;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*intarray array = new intarray();
        array.integer();
        chararray type2 = new chararray();
        type2.character();
        Stringarray sa = new Stringarray();
        sa.str();
        floatarray arr = new floatarray();
        arr.flarr();
        booleanarray ba = new booleanarray();
        ba.booleanarr();*/
        System.out.println("Select the Array type:");
        System.out.println("1.IntegerArray\t 2.CharArray\t 3.StringArray\t " +
                           "4.FloatArray\t 5.BooleanArray\t 6.DoubleArray");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                intarray ia = new intarray();
                ia.integer();
                break;
            case 2:
                chararray ca = new chararray();
                ca.character();
                break;
            case 3:
                Stringarray sa = new Stringarray();
                sa.str();
                break;
            case 4:
                floatarray fa = new floatarray();//4 bytes or 32 bit
                fa.flarr();
                break;
            case 5:
                booleanarray ba = new booleanarray();
                ba.booleanarr();
                break;
            case 6:
                doublearray da = new doublearray();//8 bytes or 64 bit
                da.darray();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
