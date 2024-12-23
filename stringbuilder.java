// public class stringbuilder {
//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Kuntal");
//        System.out.println(sb);

//        //char at index 0
//        System.out.println(sb.charAt(0));

//        // set a character
//        sb.setCharAt(0, 'p');
//        System.out.println(sb);

//        // insert a character
//        sb.insert(2, 'u');
//        System.out.println(sb);

//        // delete a string 
//        sb.delete(2, 3);
//        System.out.println(sb);
//    }
// }

//append 
// public class stringbuilder{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("h");
//         sb.append("e");
//         sb.append("l");
//         sb.append("l");
//         sb.append("o");
//         System.out.println(sb);
//     }
// }

// reverse a string 
public class stringbuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i; // 5-1-0

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}