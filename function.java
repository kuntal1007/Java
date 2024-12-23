
import java.util.Scanner;

//print name using function

// import java.util.*;
// public class function {
//     // declare a function
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      String  name = sc.next();
//      printMyName(name);// call the function
//     }
// }

// make a fuction to add 2 numbers
// import java.util.*;
// public class function{
//     public static int calculateSum(int a, int b){
//          int sum = a+b;
//          return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println("sum of 2 number is:" + sum);
//     }
// }

// make afunction to multiply 2 numbers
// public class function{
//     public static int CalculateProduct( int a, int b){
//         return a*b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("Product of 2 number is: " + CalculateProduct(a, b));
//     }
// }

// facorial of a number
public class function{
    public static void calculateFactorial( int n){
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);
    
    }
}