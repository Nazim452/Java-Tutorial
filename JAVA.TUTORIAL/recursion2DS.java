import java.util.*;
// public class recursion2DS {

// // CHECK PALINDROME OR NOT withoout reverse



//       static boolean checkPalindrome(String s, int l , int r){
//         if(l>=r) return true;

//         return (s.charAt(l)==s.charAt(r))&&checkPalindrome(s, l+1, r-1);
//       }


      
    
      

// // CHECK PALINDROME OR NOT




//       static String revers_Palindrome(String s , int index){
//           if(index==s.length()) return " ";

//           String smallAns = reverse(s, index+1);

//           // self work




//           return smallAns+s.charAt(index) ;
//        }




// // reverse of string

//      static String reverse(String s , int index){
//         if(index==s.length()) return " ";

//         String smallAns = reverse(s, index+1);

//         // self work




//         return smallAns+s.charAt(index) ;
//      }

// // REMOVE "A" FROM STRING BY CUTTING THE STRING ,WITHOURT PASSING INDEX



//      static String removeA2(String s){
//         if(s.length()==0) return "";


//         /// recursive work

//         String  smallAns = removeA2(s.substring(1));     // removing a feom the index 1 to last
        
//         // t c  of substrin - n


//         if(s.charAt(0)!='a'){
//             return s.charAt(0)+ smallAns;    // ---n

//         }else{
//             return smallAns;
//         }

       
//      }

// // t c = o(n*n)

// // REMOVE A FROM THE GIVEN STRING



//     static String removeA(String s, int index){
//         // base case


//         if(index==s.length()) return " ";

//         // recursive work

//         String smallAns = removeA(s, index+1);

//         // self work

//         if(s.charAt(index)!='a'){
//             return s.charAt(index)+smallAns;    // CONCANITAION ME TIME O(n)
//         }else{
//             return smallAns;
//         }
//     }


// //  T C = n*n = O(n^2)         n - length of string




//     public static void main(String[] args) {

//         String s = "aaaa";

//         //System.out.println(removeA(s, 0));
//         // System.out.println(removeA2(s));
//        // System.out.println(reverse(s, 0));

//        // not working

//             //    String rev = revers_Palindrome(s, 0);

//             //    if(rev.equals(s)){

//             //    System.out.println("Palindrome");
//             //    }else{
//             //             System.out.println("Not palindrome");
//             //    }

//             System.out.println(checkPalindrome(s, 0, s.length()-1));



            


//             }
//         }
           




// public class recursion2DS{


    

// // SUM OF SUBSET OF INTEGER  ARRAY


//     static void sumSubsset(int[]arr, int n , int index, int currSum){
//         if(index>=n){
//             System.out.println(currSum);
//             return;
//         }


//         // ans + current elem

//         sumSubsset(arr, n, index+1, currSum+arr[index]);



//         // ans ---- no add curr elem
//         sumSubsset(arr, n, index+1, currSum);
//     }






// // print sub set sequence of string -- best way










//     static void string_Sub_Sequqence2(String s, String cuurrentAns){


//         // bas e casae

//         if(s.length()==0){
//             System.out.println(cuurrentAns);
//             return;
//         }

//         char curr = s.charAt(0);

//         String remainingString = s.substring(1);

//         string_Sub_Sequqence2(remainingString ,cuurrentAns+curr); // add current element

//         string_Sub_Sequqence2(remainingString, cuurrentAns);   // do not add current elem
//     }

      
// // S C - no of max stack form X mAX SPACE OCCUPIED IN 1  stack frame
// // S C = n*n ---- thi s is best as compare to return arralist





// //RETURN SUB STRING SEQUENCE USING ARRAYLIST



//     static ArrayList<String> string_Sub_Sequqence(String s){
    

//         ArrayList<String> ans = new ArrayList<>();
//         // base case
//         if(s.length()==0){
//            ans.add(" ");
//            return ans;
//         }

//         char current = s.charAt(0);

//         ArrayList<String> smallAns = string_Sub_Sequqence(s.substring(1));
//       // smallAns = "Bc", b , c, " "  
//       // Ans = "Bc", b , c, " "     + abc , ab , ac, a
        
//         for(String ss: smallAns){
//             ans.add(ss);               // smallAns = "Bc", b , c, " "  
            
            
//             ans.add(current + ss);     // Ans = "Bc", b , c, " "     + abc , ab , ac, a
//         }
//         return ans;


//     }
// //SC - 2^n  -- take more space bcz exponential
// // where n is 3 for abc

//     public static void main(String[] args) {
//             String s = "abc";
//         //  ArrayList<String> ans = string_Sub_Sequqence(s);
//         //  for(String ss:ans){
//         //     System.out.println(ss);
//         //  }

//          // string_Sub_Sequqence2(s, " ");
//          int[]arr = {2,4,5};

//          //sumSubsset(arr, arr.length, 0, 0);
       



      




        
//     }
// }










public class recursion2DS{


// keypad type problem
    


//     NOT WORKING

    static void combination (String dig, String[]kp, String currRes){

        if(dig.length()==0){
            System.out.print(currRes+" ");
            return;
        }

        int currNum = dig.charAt(0)-'0'; //2
        String currChoice= kp[currNum]; // abc 

        for(int i =0; i<currChoice.length();i++){
            combination(dig.substring(1), kp, currRes+currChoice.charAt(i));
        }


    }
// TC =  O(n.4^n)

    static int frogJumpBest(int []h, int n, int currr_index){

        if(currr_index==n-1) return 0;

        int op1 = Math.abs(h[currr_index]-h[currr_index+1])+frogJumpBest(h, n, currr_index+1);

        if(currr_index==n-2) return op1;


        int op2 = Math.abs(h[currr_index]-h[currr_index+2])+frogJumpBest(h, n, currr_index+2);



        return Math.min(op1, op2);

        
    }
// T C-     2^n
    public static void main(String[] args) {
       // int[]h = { 10,30,40,20};

       // System.out.println(frogJumpBest(h, h.length, 0));

       String dig = "23";

       String[]kp = {"", "" , "abc", " def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

       combination(dig, kp, "");
    }
}

































































