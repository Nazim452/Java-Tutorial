import java.util.ArrayList;

//public class recursionDS {

// CLACULATE P TO YHE POWER Q

     //static int pow(int p , int q){
    //     if(q==0){
    //         return 1;
    //     }

    //     // recursive work

    //     int ans = pow(p, q-1);

    //     // self work

    //     int finalAns = ans*p;

    //     return finalAns;
    //  }
    

// TIME COMP - O(q)      ---OREDER OF Q PE DEPENT KAR RAHA HAI MERA RUNTCOMP

// SPACE COMP - O(q)      -- q KA JITNA VLAUW HOGA UTNA STACK FRAME BANEGA


// CLACULATE P TO THE POWER Q USING RECURSION - ---   ALTERNATE APPROACH --- BEST RUNTCOMP


//     static int  pow1(int p, int q){

//         int ans = pow(p, q/2);


//         if(q%2==0){
//             return ans*ans;
//         }else{
//             return ans*ans*p;
//         }
//     }

// // t c =  O(log q)


// // COUNT NO OF DIGIT USING RECURSION



//     static int countDigit(int n){
//         //base case

//         if(n>=0 && n<=9){
//             return 1;
//         }

//         // recursive work

//         int smallAns = countDigit(n/10);

//         // self work
//         int ans = smallAns+1;

//         return ans;

//     }


// // SUM OF N- DIGIT

//     static int sumOfDigit(int n){
//         // base case

//         if(n>=0 &&n<=9){
//             return n;
//         }

//         // recursive work

//         int smallAns = sumOfDigit(n/10);

//         // self work

//         int ans = smallAns+n%10;

//         return ans;
//     }



// //FIND NTH FBONACCI NUMBERR   & print nth term fibonacci series



//      static int fib(int n){
//         // base condition

//         if(n==0 || n==1){
//             return n;
//         }

//         // recursive work - smalller prob

//         int prev = fib(n-1);
//         int prevPrev = fib(n-2);
        
        
//         // self work

//         return fib(n-1)+  fib(n-2);
//      }

// // RUN TIME COMP - O(2^K)

// // SPACE COMP - O(N)


// // FACTORIAL



//     static int factorial(int n){

//         // base case
//         if(n==1 || n==0){
            
//             return 1;
//         }

//         // smaller problem - recursive work

//         int smallAns = factorial ((n-1));

//         // self work

//         int ans = n*smallAns;


//         return ans;
       

//     }

// // RUN TIME COMP - O(n)
// //SPACE COMP - 0(N)

// //  SORTEST WAY


//       static int factorial1(int n){
//         if(n==0){
//             return 1;

            
//         }
//         return n*factorial1(n-1);

//       }

    
// //PRINT N TO 1 IN DECRAESING ORDER



//      static void decreasingOrder(int n){
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         System.out.println(n);
//         decreasingOrder(n-1);
//      }






// // PRINT 1 TO N NUMBER USING RECURSION



//    static void printIncreasing(int n){    // recursion prnt 1,2,3.....n,n-1
//         if(n==1){
//             System.out.println(1);
//             return ;

//         }

//         printIncreasing(n-1);      // print  1 to  n-1 number
//         System.out.println(n);
//     }
//     public static void main(String[] args) {
        
//         //printIncreasing(5);
//         //decreasingOrder(5);

//        // System.out.println(factorial1(4));


//        // for print fibonacci series

//        //for(int i = 0; i<=10; i++){
//        // System.out.println(fib(i));


//       // System.out.println(sumOfDigit(1234));

//      // System.out.println(countDigit(12348));

//      System.out.println(pow1(2, 5));

//        }

       
// }
    





public class recursionDS{

    static boolean isSoretd(int [] arr , int index){
        if(index == arr.length-1){
            return true;
        }

        // self work

        if(arr[index]<arr[index+1]){
            return isSoretd(arr, index+1);

        }else{
            return false;
        }




        // recursive work
       
    }


//  RETURN ALL INDEXES OF TARGET ---- SIMILAR TO NEXT QUESTUION ONLY DEFFERENCE IS HERE , RETRUN -NO PRINT


    static ArrayList<Integer> returnINdex(int [] arr, int n, int targert, int index){
        if(index>=n){
            return new ArrayList<Integer>();  // return emoty list
        }


        // self work


        ArrayList <Integer> ans =  new ArrayList<>();

        if(arr[index]==targert){
            ans.add(index);
            
        }

        ArrayList<Integer> smallAns = returnINdex(arr, n, targert, index+1);
        ans.addAll(smallAns);
        return ans;
        
    }


//  PRINT ALL INDEXES OF TARGET


    static  void findIndex(int [] arr, int n ,int targert, int index ){

        if(index>=n){
            return;
        }

        if(arr[index]==targert){
            System.out.println(index);
        }

        findIndex(arr, n, targert, index+1);
    }

// PRINT WHETHER X IS PRESENT IN ARRAY OR NOT



   static boolean searchArray(int []arr, int n , int targert , int index){

    // base casw
    if(index>=n) return false;
    

    // self work

    if(arr[index]==targert) return true;

    if(searchArray(arr, n, targert, index+1)==true) {    // OR retun searchArray(arr, n, targert, index+1)
        return true;
    }else{
        return false;
    }
}




// T C & SC - O(n)



// PRINT INDEX OF TARGET ELEMENT



    static int  searchArray1 (int[]arr, int n , int target, int index){
        if(index>=n){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }

       return searchArray1(arr, n, target, index+1);
    }




  
// SUM OF ARRAY

    static int sumOfArray(int[] arr, int index){

        // base case

        if(index == arr.length-1){
            return arr[index];
        }

        // recursive work


        int ans =sumOfArray(arr, index+1);


        //self work

        return ans+arr[index];


    }

// PRINT MAX ELEM FROM ARRAY

   static int maxArray(int [] arr, int index){

    // base case

    if(index == arr.length-1){
        return arr[index];
    }

    // recursive work - small prob

    int ans = maxArray(arr, index+1);



    // self work 

   return Math.max(ans, arr[index]);
   }

// T C - O(n)   ---n   - length of array
// sc = O(n)    n stack frame        ----- if we soolve with recursion then S C - O(1) , not effect on T C
   

// print array using recursion

  static void printArray(int [] arr, int index){
    // base case

    if(index == arr.length){
        return;

    }

    // self work

    System.out.println(arr[index]);


    // recursion work

    printArray(arr, index+1);
  }

// GCD USING EUCLIDS ALGORITHM
// GCD(X,Y) = GCD(Y, X%Y)   & GCD(X,0) = X


   static int rGCD(int x , int y){

    if(y == 0){
        return x;                       // see above 2nd approach of comment
    }
    return rGCD(y, x%y);
   }



// GCD USING RECURWION - LONG DIV

    static int iGCD(int x, int y){
        while(x%y!=0){

            int rem = x%y;

            x = y;
            y = rem;

        }
        return y;
    }

// given a number n . find sum of natural no till n but with alternatre sign

// given series  = 1-2+3-4+5......
//input  n = 10    || output = -5
//input  n = 3     output = 3



    static int alternateSeriesSum(int n){
        if(n==0){
            return 0;
        }

        if(n%2==0){
          return  alternateSeriesSum(n-1)-n;


        }else{
           return alternateSeriesSum(n-1)+n;
        }
    }

// time comp = no of recursive call X time taken in 1 call
//     t c = n X cons   ---   O(n)


// GIVEN A NUMBER AND A VLAUE K , PRINT K MULTIPLES OG NUM



    static void multiples(int num, int k){
        if(k==1){
            System.out.println(num);
            return;
            
            

        }
        // recursive work

       multiples(num, k-1);

       // self work
       System.out.println(num*k);

//  t c & s c = O(k) bcz      tc depend on k vlaue

    



        

        
    }
    public static void main(String[] args) {
     //   multiples(15, 10);


//GCD  
    // int x  = 12; 
    // int y = 8;
    // int gcd = 1;

    // for(int i = 1;i<=x &&i<=y ; i++){
    //     if(x%i==0 &&y%i==0){
    //         gcd = i;
    //     }
    

    // }
    // System.out.println(gcd);
     

     
     //System.out.println(alternateSeriesSum(5));

     //System.out.println(iGCD(5, 7));

    // System.out.println(rGCD(15, 24));

    int [] arr = {1,2,3,45,78,56};

   // printArray(arr, 0);

   //System.out.println(maxArray(arr, 0));
   
  // System.out.println(sumOfArray(arr, 0));
 


//   if(searchArray(arr, arr.length,12, 0)){
//     System.out.println("Yes");
    

//   }else{
//     System.out.println("No");
//   }

      int n = arr.length;



     // System.out.println(searchArray1(arr, n, 6, 0));

     //findIndex(arr, n, 4, 0);

   // ArrayList<Integer> ans = returnINdex(arr, n, 4, 0);

    // for(Integer elem:ans){
    //     System.out.println(elem);
    // }


    if(isSoretd(arr, 0)){
        System.out.println("yes");
    }
    else{
        System.out.println("No");
    }


    

     
        
       

     }


     
        
    }























































































    

