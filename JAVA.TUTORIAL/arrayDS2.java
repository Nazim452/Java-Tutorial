import java.util.Scanner;

//public class arrayDS2 {

// // SORTING OF 1 & 0 ARRAY

//     static void sorting(int[] arr){
//         int zeroes = 0;

//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] ==0){
//                 zeroes++;
//             }
//         }
//         for(int i = 0; i<arr.length; i ++){
//             if(i<zeroes){
//                 arr[i] =0;
//             }else{
//                 arr[i] = 1;
//             }
//         }
//     }
// // FOR SWAPPING
//     static void swap(int[] arr ,int i, int  j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
// }

// // 2nd  WAY TO SORTING ARRAY OF 0 & 1 WIHOUT USING 2 TIMES TRAVERSAL


//     static void sorting2(int[] arr ){
//         int left = 0;
//         int right = arr.length- 1;

//         for(int i  = 0; i<arr.length; i++){
//             while(left<right){
//                 if(arr[left] == 1 && arr[right]==0){
//                     swap(arr, left, right);
//                     left++;
//                     right--;
//                 }
//                 if(arr[left] ==0){
//                     left++;
//                 }
//                 if(arr[right] ==1){
//                     right--;
//                 }
//             }
//         }


       
//     }

// // pahle even no  array me se then odd no - arrange kare


 
//     static void  EOsorting(int[] arr ){
//         int left =0;
//         int right = arr.length-1;
//        // for(int i = 0; i<arr.length; i++){
//             while(left<right){
//                 if(arr[left]%2 == 1 && arr[right]%2 == 0){
//                     swap(arr, left, right);
//                     left ++;
//                     right--;
//                 }
//                 if(arr[left]%2 == 0){
//                     left++;
//                 }
//                 if(arr[right]%2 ==1){
//                     right--;
//                 }
//             //}
//         }

        
       
//     }



// print square of array elemant in increasing order -- if array element in may be negative




    //  static int[]  square(int[] arr){
    //     int left = 0 , right = arr.length -1;

    //     int[] ans = new int[arr.length];
    //     int k = arr.length-1;


    //     while(left<=right){
    //         if(Math.abs(arr[left]) > Math.abs(arr[right])){
    //             ans[k--] = arr[left]* arr[left];
    //             left++;
    //         }else{
    //             ans[k--] = arr[right]*arr[right];
    //             right--;
    //         }
            
    //     }
    //     return ans;
    // }



// // PREFIX OF ARRAY


//     static int[] prefixArray(int[] arr){
//         int[] pref = new int[arr.length];
//         pref[0] = arr[0];

//         for(int i = 1; i<arr.length; i++){
//             pref[i] = pref[i-1] + arr[i];
//         }
//         return pref;
//     }



// // prefix of array without using another stack
 


//     static int[] prefixArray2(int[] arr){
//         
//         for(int i = 1; i<arr.length; i++){
//             arr[i] = arr[i-1]+ arr[i];
//         }
//         return arr;
//     }




// helping method for print array



  // static  void printArray(int[]arr){
  //     for(int i = 0; i<arr.length; i++){
   //        System.out.println(arr[i] + " ");
   //    }
  // }  
   // public static void main(String[] args) {
     //  int[] arr = {1,0,0,1,1,0,1,0};

       
      // int []arr = { -10, -5, -2 , 1 ,4 ,9};

       //int[] arr = {2,3,4,6,7};
      //  sorting(arr);
        //printArray(arr);

        //sorting2(arr);
        //printArray(arr);
        // EOsorting(arr);
        // printArray(arr);

      //  int[] ans = square(arr);
       // printArray(ans);

        //int[] pref =  prefixArray(arr);
        //printArray(pref);
        //int[] pref = prefixArray2(arr);
       // printArray(pref);
  // }
    
//}




public class arrayDS2{
  static int[] prefix(int[]arr){
    for(int i =1; i<arr.length; i++){
        arr[i]+= arr[i-1];
        
        
    }
    return arr;
}
 // FOR A GIVEN ARRAY , ANS Q QUERIES TO PRINT THE SUM OF VALUE IN AGIVEN RANGE
// OG INDICES L TO R
    
// INDICES START FROM 1 
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");

    int n = sc.nextInt();

    int[]arr = new int[n+1];

    System.out.println("Enter "+n+ "element");

    for(int i = 1; i<=n; i++){
        arr[i] = sc.nextInt();
    }

    int[] prefSum = prefix(arr);

    System.out.println("ENter no of queries");
    int q = sc.nextInt();

    while(q-->0){
        System.out.println("Enter left range");
        int l = sc.nextInt();

        System.out.println("enter right range");

        int r = sc.nextInt();

        int ans = prefSum[r]-prefSum[l-1];

        System.out.println("sum "+ ans);
    }
   



    
   



}

}

   




// check if we partition of two sub array with equal sum 


// public class arrayDS2{
//     static int ArraySum(int[] arr){
//         int TotSum = 0;
//         for(int i = 0; i<arr.length ; i++){
//             TotSum = TotSum+ arr[i];

//         }
//         return TotSum;
//     }

//     static boolean PartitionSumArr(int[] arr){

//         int TotSum = ArraySum(arr);

//         int prefsum = 0; 
//         for(int i = 0; i < arr.length; i++){
//             prefsum = prefsum + arr[i];

//             int suffSum = TotSum - prefsum;

//             if(suffSum == prefsum){
//                 return true;
//             }
//         }
//         return false;

//     }
//     public static void main(String[] args) {
//         int[] arr = { 1, 1, 1, 1,1, 1};
//         System.out.println("Equal partition of array possible " + PartitionSumArr(arr));
        
//     }
// }






// for an array soreted in increasing order , return an array of sqaure of each no sorted
// in non decreasing order

// my ans is coming in decrasing
// reverse fun is not working for increasing



// public class arrayDS2{

// // FOR SWAPPING
//   static void swap(int[] arr ,int i, int  j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//      }
// // REVERSE

//   static int[] reverse(int[] arr ){
//     int[] ans = new int[arr.length]; 

//     for(int i = arr.length-1; i>=0; i--){
//       ans[i++] = arr[i];
      
//     }
//     return ans;

//   }



//   static int[] sortSquare(int[] arr){
//     int n = arr.length;
//     int left = 0, right = n-1;
//     int[] ans = new int [n];
//     int k = 0;

//     while(left<=right){
//       if(Math.abs(arr[left])> Math.abs(arr[right])){
//         ans[k++] = arr[left]* arr[left];
//         left++;
//       }else{
//         ans[k++] = arr[right] * arr[right];
//         right--;
//       }
//     }
//     return ans;
//   }

// // helping method for print array



//   static  void printArray(int[]arr){
//       for(int i = 0; i<arr.length; i++){
//           System.out.println(arr[i] + " ");
//       }
//   }  
//   public static void main(String[] args) {
//     int[] arr = {-10, -5, -2, 1 , 4, 9 };

//     int[] ans = sortSquare(arr);
//     reverse(arr);    // not  working
    
    
//     printArray(ans);
    
    

    
//   }
// }



// public class arrayDS2{
//   static int[] MakePrefixSumArray(int[] arr){
//     for(int i = 0; i<arr.length; i++){
//       arr[i] += arr[i-1];
//     }
//     return arr;
//   }
//   public static void main(String[] args) {
//     int[] arr = { 1,2,3,4,5};
//     int[] prefsum = MakePrefixSumArray(arr);

//     Scanner sc  = new Scanner( System.in);
//     System.out.println("Enter no of qeries");

//     int q = sc.nextInt();

//     while(q-->0){
//       System.out.println("Enter range");
//       int l = sc.nextInt();
//       int r = sc.nextInt();

//       int ans = prefsum[r] - prefsum[l-1];

//       System.out.println("Sum= "+ ans);
//     }
    
//   }
// }

