import java.util.Scanner;

// public class LoopDs {
//     public static void main(String[] args) {


//  COUNT N NUMBER OF DIGIT


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no");

        // int n = sc.nextInt();
        // int noOfDigit = 0;

        // int original_n = n;
        
        // while(n>0){
        //     n = n/10;
        //     noOfDigit++;

        // }

        // System.out.println("You given number is " + original_n+ " No of digit = " + noOfDigit);







//// FIND SUM OF DIGIT
       

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no");

        // int n = sc.nextInt();
        // int sumOfDigit = 0;

        // int original_n = n;

        // while(n>0){
        //     sumOfDigit = sumOfDigit+n%10;
        //     n= n/10;
        // }

        // System.out.println("Sum of digit is " + original_n + " = " + sumOfDigit);







// REVERSE OG DIGIT
       
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no");

        // int n = sc.nextInt();

        // int ans = 0;

        // while(n>0){
        //     ans = ans*10 + n%10;
        //     n = n/10;
        // }

        // System.out.println("Reverse no is " + ans);
        
       



 // find sum of 1-2+3-4+5........N

// if input =  5 ,  5 means (1-2+3-4+5)  , output = 3


       
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no");

        // int n = sc.nextInt();

        // int ans = 0;

        // for(int i = 0; i<=n; i++){
        //     if (i%2==0){
        //         ans = ans-i;
        //     }
        //     else{
        //         ans = ans+i;
        //     }
        // }

        // System.out.println(ans);





// find factorial of first n number



      
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no");

        // int n = sc.nextInt();

        // int fact= 1;

        // for(int i = 1; i<=n; i++){
        //     fact = fact*i;

        //     System.out.println("Factorial of "+ i + " : "  + fact);




// FINDINFG A RAISD TO THE POWER B

                                 
        // int  a = 2; 
        // int b = 5;
        // int ans = 1;
        

        // for(int i = 1; i<=b; i++){
        //         ans = ans*a;

        // }
        // System.out.println(ans);


        // }

       

        // }







// ****** --  PATERN PRINTING

public class LoopDs{
        public static void main(String[] args) {


// RECTANGULAR PATTERN




                // for(int i = 1;i<3;i++ ){
                //         for(int j = 1; j<6; j++){
                //                 System.out.print("*");
                //         }
                //         System.out.println();

                
                // }
              





// RECTANGULAR PATTERN BUT ONLY BOUNDARY
         


        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter no of row:- ");

        //     int r = sc.nextInt();

        //     System.out.println("Enter no of column:-  ");

        //     int c = sc.nextInt();

        //     for(int i = 1;i<=r;i++){
        //         for(int j = 1; j<=c; j++){
        //                 if(i==1|| i==r|| j==1|| j==c){
        //                         System.out.print("*");
        //                 }
        //                 else{
        //                         System.out.print(" ");
        //                 }
        //         }
        //         System.out.println();
        //     }







// TRIANGULAR  PATTERN 
           

         
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter no of row:- ");

        // int r = sc.nextInt();
        // for(int i = 1; i<=r; i++){
        //         for(int j = 0; j<=i; j++ ){
        //                 System.out.print("*");
        //         }
        //         System.out.println();
        // }
 



//RVERSE TRIANGULAR PATTTERN



        
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter no of row:- ");

        //     int r = sc.nextInt();
        //     for(int i = r; i>=1; i--){
        //             for(int j = 1; j<=i; j++ ){    //r+1-i --print *
        //         System.out.print("*");
        //             }
        //             System.out.println();
        //     }
            

       

// PYRAMID STRUCTURE



         
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter no of row:- ");

        //     int r = sc.nextInt();

        //     System.out.println("Enterr no of column");

        //     int c = sc.nextInt();

        //     for(int i = 1; i<=r; i++){      //traversing each rows


        //         // print r-i   spaces


        //         for(int j = 1; j<=r-i; j++){
        //                 System.out.print(" ");
        //         }

        //         // print 2*i-1       *

        //         for(int k = 1; k<=2*i-1; k++){
        //                 System.out.print("*");
        //         }

        //         System.out.println();
        //     }






// NUMERICAL RECTANGLE
        



        // for(int i = 1; i<=r; i++){

        //         // print  i to r  number


        //         for(int j =i; j<=r; j++){
        //                 System.out.print(j);
        //         }

        //         // 1 to i-1 print

        //         for(int k = 1; k<=i-1; k++){
        //                 System.out.print(k);
        //         }

        //         System.out.println();
        // }









        // 1234567
        // 1234567
        // 1234567        this pattern print
        // 1234567
        // 1234567
        // 1234567


        // for(int i = 1; i<=r; i++){
        //         for(int j =1; j<=c; j++){
        //                 System.out.print(j);
        //         }
        //         System.out.println();
        // }





        // 121212
        // 212121       print this pattern
        // 121212
        // 212121

//        for(int i = 1; i<=r; i++){
//         for(int j = 1; j<=c; j++){

//                 if((i+j)%2==0){
//                         System.out.print(1);

//                 }else{
//                         System.out.print(2);
//                 }
                

//         }
//         System.out.println();
//        }







//    1
//   121
//  12321       print this pattern
// 1234321


        //  for(int i = 1; i<=r; i++){
                

        //                 // print 1 to r-i spaces

        //                 for(int k= 1; k<=r-i; k++){
        //                         System.out.print(" ");
        //                 }

        //                 // print 1 to i

        //                 for(int l = 1; l<=i; l++){
        //                         System.out.print(l);
        //                 }


        //                 // print i-1 to 1

        //                 for(int m = i-1; m>=1; m--){
        //                         System.out.print(m);
        //                 }

        //                 System.out.println();
        //         }
                
        //  }








//          1
//         2 2
//        3   3
//       4444444


        // for(int i = 1; i<=r; i++){

        //         //1 to r-1 space

        //         for(int j = 1; j<=r-i; j++){
        //                 System.out.print(" ");
        //         }


        //         for(int k = 1; k<=2*i-1; k++){
        //                 if(k==1||k==2*i-1|| i==r){
        //                         System.out.print(i);
        //                 }
        //                 else{
        //                        System.out.print(" ");
        //                 }
                       
        //         }
        //         System.out.println();
        //}
               




// CONVERT BINARY TO DECIMAL
      




        //  Scanner sc = new Scanner(System.in);

        //  System.out.println("Enter binary number: ");

        //  int binary_No = sc.nextInt();

        //  int ans = 0 ;     // conveted into decimal
        //  int powerOf2 = 1;   // 2^0 = 1


        //  while(binary_No>0){

        //         int unit_digit = binary_No%10;

        //         ans= ans+(unit_digit*powerOf2);

        //         binary_No = binary_No/10;
        //         powerOf2 = powerOf2*2;

        //  }
        //  System.out.println("Decimal no is");
        //  System.out.println(ans);





        // int decimal_Number = 4;

        // int ans = 0;
        // int powerOf10 = 1;   //  10^0 = 1  - initilyy

        // while(decimal_Number>0){
        //         int parity= decimal_Number%2;      // parity  - remainder when divided by  2

        //         ans = ans+(parity*powerOf10);
        //         powerOf10*=10;

        //         decimal_Number/=2;
                

        // }
        // System.out.println(ans);








        int decimal_Number = 13;

        int ans = 0;
        int powerOf10 = 1;

        while(decimal_Number>0){

                int parity = decimal_Number%2;

                ans = ans+(parity*powerOf10);

                powerOf10*=10;

                decimal_Number/=2;

        }
        System.out.println(ans);





     









        }

      
        }


