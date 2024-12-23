
// import java.util.Scanner;

// public class Strings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("please enter your name :" );
//         String name = sc.next();
//         System.out.println("My name is :" + name);
//     }
// }

// //concatenation method
// public class Strings{
//     public static void main(String[] args) {
//         String firstname = "Kuntal";
//         String lastname = "Dobariya";
//         String name = firstname + " " + lastname;
//         System.out.println("Full name is:" + name);
//         // length method
//         System.out.println("Length of the name is :" + name.length());
//         // charAt method
//         for(int i = 0; i< name.length(); i++){
//             System.out.println(name.charAt(i));
//         }
//     }
// }

// compare 2 strings
// public class Strings{
//     public static void main(String[] args) {
//         String name1 = "Kuntal";
//         String name2 = "Kuntal";
//         if(name1.compareTo(name2)== 0){
//             System.out.println("Strings are equal");
//         } else{
//             System.out.println("strings are not equal");
//         }
//     }
// }

//substring method
public class Strings{
    public static void main(String[] args) {
        String sentence = "My name is Kuntal";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}