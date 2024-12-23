
import java.util.Scanner;

// get bit manipulation
// public class Bitmanipulation {
//     public static void main(String[] args) {
//         int n=5;
//        // int pos = 3;
//        int pos = 2;
//         int bitmask= 1<<pos;
//         if ((bitmask & n) == 0){
//             System.out.println("Bit was Zero");
//         } else{
//             System.out.println("Bit was One");
//         }
//     }
// }

// set bit manipulation
// public class Bitmanipulation{
//     public static void main(String[] args) {
//         int n = 5; 
//         int pos = 1;
//         int bitmask = 1 << pos;
//         int newNumber = bitmask | n;
//         System.out.println(newNumber);
//     }
// }

// clear bit manipulation
// public class Bitmanipulation{
//     public static void main(String[] args) {
//         int n = 5; 
//         int pos = 2;
//         int bitmask = 1 << pos;
//         int notbitmask = ~(bitmask);
//         int newNumber = notbitmask & n;
//         System.out.println(newNumber);
//     }
// }

//update bit manipulation
public class Bitmanipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;
        // set
        if (oper == 1) {
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        } // clear
        else {
            int newbitmask = ~(bitmask);
            int newNumber = newbitmask & n;
            System.out.println(newNumber);
        }
    }
}