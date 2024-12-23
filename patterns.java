// solid rectangle pattren
// public class patterns {
//     public static void main(String[] args) {
//         for(int i=1; i<=4; i++){
//             for(int j =1; j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println("*");
//         }
//     }
// }


// hollow rectangle
// public class patterns{
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;
//         for(int i=1; i<=n; i++){
//             for(int j =1; j<=m; j++){
//                 if(i==1 || j==1 || i==n || j==m){
//                 System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// pyrmid pattern
// public class patterns{
//         public static void main(String[] args) {
//         int n = 4;   
//             for(int i=1; i<=n; i++){
//                  for(int j =1; j<=i; j++){
                    
//                     System.out.print("*");
//                     } 
//                     System.out.println();
//                    }
//             }
//          }

// reverse pyramid
// public class patterns{
//    public static void main(String[] args) {
//    int n = 4;   
//        for(int i=n; i>=1; i--){
//             for(int j =1; j<=i; j++){
               
//                System.out.print("*");
//                } 
//                System.out.println();
//               }
//        }
//     }
    
// pyramid
// public class patterns{
//    public static void main(String[] args) {
//        int n =4 ;
//        for(int i =1; i<=n; i++){
//          for(int j= 1; j<=n-i; j++){
//             System.out.print(" ");
        
//          }
//          for(int j= 1; j<=i; j++){
//             System.out.print("*");
//          }
//          System.out.println();
//        }
//    }
// }

// number pyramid
// public class patterns{
//    public static void main(String[] args) {
//        int n =5 ;
//        for(int i =1; i<=n; i++){
//          for(int j= 1; j<=i; j++){
//             System.out.print(j + " ");
        
//          }
         
//          System.out.println();
//        }
//    }
// }

// reverse number pyramid
// public class patterns{
//    public static void main(String[] args) {
//        int n =5 ;
//        for(int i =1; i<=n; i++){
//          for(int j= 1; j<=n-i+1; j++){
//             System.out.print(j + " ");
        
//          }
         
//          System.out.println();
//        }
//    }
// }

//Number pyramid
// public class patterns{
//    public static void main(String[] args) {
//        int n =5 ;
//        int number = 1;
//        for(int i =1; i<=n; i++){
//          for(int j= 1; j<=i; j++){
//             System.out.print(number + " ");
//             number++;
//          }
         
//          System.out.println();
//        }
//    }
// }

// 0 and 1 pyramid
public class patterns{
   public static void main(String[] args) {
       int n =5 ;
       for(int i =1; i<=n; i++){
         for(int j= 1; j<=i; j++){
            int sum = i+j;
            if(sum%2==0){
               System.out.print("1");
            } else {
               System.out.print("0");
            }
            
        
         }
         
         System.out.println(); // this is for new line when one loop is complete
       }
   }
}
