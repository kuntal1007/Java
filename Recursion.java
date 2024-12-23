//print number 5 to 1 using recursiom
// public class Recursion {
//     public static void printNUm(int n){
//         if (n == 0){
//             return;
//         }
//         System.out.println(n);
//         printNUm(n-1);
//     }
//     public static void main(String[] args) {
//         int n =5;
//         printNUm(n);
//     }
// }


//print the number 1 to 5
// public class Recursion{
//     public static void printNUm(int n){
//         if (n==6){
//             return;
//         }
//         System.out.println(n);
//         printNUm(n+1);
//     }
//     public static void main(String[] args) {
//         int n =1;
//         printNUm(n);
//     }
// }

// print sum of n numbers
// public class Recursion{
//     public static void printSum(int i, int n, int sum){
//         if (i==n){
//             sum += i;
//             System.out.println(sum);
//             return;
//         }
//         sum = sum+i;
//         printSum(i+1, n, sum);
//     }
//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }
// }

//factorial of n number
// public class Recursion{
//     public static int calfactorial(int n){
//         if (n==1 || n==0){
//             return 1;
//         }
//        int fact1= calfactorial(n-1);
//        int fact = n*fact1;
//        return fact;

//     }
//     public static void main(String[] args) {
//         int n = 6;
//         int ans = calfactorial(n);
//         System.out.println(ans);
//     }
// }

//fibonacci series
// public class Recursion{
//     public static void printFibo(int a, int b, int n){
//        if(n==0){
//         return;
//        }
//         int c=a+b;
//         System.out.println(c);
//         printFibo(b, c, n-1);

//     }
//     public static void main(String[] args) {
//         int a=0, b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=9;
//         printFibo(a, b, n-2);

//     }
// }

// print x^n (stack hight = n)
// public class Recursion{
//     public static int calPower(int x, int n){
//         if (n==0){
//             return 1;
//         }
//         if (x==1){
//             return 0;
//         }
//         int xpower = calPower(x, n-1);
//         int xpow = xpower* x;
//         return xpow;
//     }
//     public static void main(String[] args) {
//         int x=3, n=5;
//         int ans = calPower(x, n);
//         System.out.println(ans);
//     }
// }

// print x^n (stack hight logn)
public class Recursion{
    public static int calPower(int x, int n){
        if (n==0){
            return 1;
        }
        if (x==1){
            return 0;
        }
        if(n%2==0){
            return calPower(x, n/2) * calPower(x, n/2);
        } else{
            return calPower(x, n/2) * calPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x=2, n=5;
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}