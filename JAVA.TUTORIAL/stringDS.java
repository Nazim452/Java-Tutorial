import java.util.*;
public class stringDS {
    static boolean isPalindrome(String str){
        int i =0, j = str.length()-1;
        boolean flag = true;      // palindrome
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag = false;
                break;
            }
            i++; 
            j--;
        }
        if(flag==true) return true;
        return false;
    }
    
    public static void main(String[] args) {


// TO FIND SAUBSTRING


    //     String str = "abcd";

    //     for(int i =0; i<str.length(); i++){
    //         for(int j = i+1; j<=str.length(); j++){
    //             System.out.println(str.substring(i, j));
    //         }
    //     }
        
  


// I/P =    PhySIcs         O/P = pHsiCS



    //  Scanner sc = new Scanner(System.in);
    //  System.out.println("Enter string");
    //  StringBuilder str = new StringBuilder(sc.nextLine());
    //  System.out.println(str);

    //  for(int i =0; i<str.length(); i++){
    //     boolean flag = true;    // capital
    //     char ch = str.charAt(i);
    //     //if(ch ='') continue;

    //     int ascii = (int)ch;
    //     if(ascii>=97) flag = false;    // small

    //     if(flag==true){
    //         ascii+=32;
    //         char dh = (char)ascii;
    //         str.setCharAt(i, dh);
    //     }else{
    //         ascii-=32;
    //         char dh = (char)ascii;
    //         str.setCharAt(i, dh);
    //     }
    //  }System.out.println("Your ans is ");
    //  System.out.println(str);

   
    
  
// RETURN THE NO OF PALINDROME SUBSTRING IN IT



    //   String str = "abcba";
    //   int count =0;

    //   for(int i =0; i<str.length(); i++){
    //     for(int j =i+1; j<=str.length(); j++){
    //         if(isPalindrome(str.substring(i, j))==true){
    //             System.out.println(str.substring(i,j));
    //             count++;
    //         }
    //     }
    //   }
    //   System.out.println("The no of palindrome string is  "+ count);





//  REVERSE EACH WORD OF SENTENCE





    //  String str = "i am a good educator";
    //  String ans = "";
    //  StringBuilder sb = new StringBuilder("");

    //  for(int i=0; i<str.length(); i++){
    //     char ch = str.charAt(i);
    //     if(ch!=' '){
    //         sb.append(ch);
    //     }else{
    //         sb.reverse();
    //         ans+=sb;
    //         ans+=' ';
    //         sb = new StringBuilder("");
    //     }
    //  }sb.reverse();
    //  ans+=sb;
    //  System.out.println(ans);


  
    


//   i/p= aaa bb c   o/p = a3b2c

 

     String str = "aaabbcccce";
     String ans= ""+ str.charAt(0); 
     int count  =1;
     for(int i =1; i<str.length(); i++){
        char curr = str.charAt(i);
        char prev = str.charAt(i-1);

        if(curr==prev){
            count++;
        }else{
             if(count>1) ans+=count;
            count=1;
            ans+=curr;
        }
     }
     if(count>1) ans+=count;
     System.out.println(ans);
    }
     
}
