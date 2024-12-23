
// import java.util.Scanner;

// public class Arrays {
//     public static void main (String args[]){
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols= sc.nextInt();
//        int [][] Number= new int[rows][cols];
//        //input
//        for (int i = 0; i< rows; i++){
//         for (int j = 0; j<cols; j++){
//             Number[i][j]= sc.nextInt();
//         }
//        }
//        //output
//        for (int i=0;i<rows; i++){
//         for(int j=0; j<cols; j++){
//             System.out.print(Number[i][j]+" ");
//         }
//         System.out.println();// this is for next line when one loop is complete
//        }
//     }
// }

import java.util.*;

public class Arrays {
    public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols= sc.nextInt();
       int [][] Number= new int[rows][cols];
       //input
       for (int i = 0; i< rows; i++){
        for (int j = 0; j<cols; j++){
            Number[i][j]= sc.nextInt();
        }
       }
       int x = sc.nextInt();
       //output
       for (int i=0;i<rows; i++){
        for(int j=0; j<cols; j++){
            //compare with x
            if(Number[i][j]==x){
                System.out.println("X found on :("+i+"  ,"+ j+")");
            }
            
        }
        
    }

    }
}
