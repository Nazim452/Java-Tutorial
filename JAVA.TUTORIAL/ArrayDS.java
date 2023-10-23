import java.util.Arrays;
import java.util.Scanner;



// find max no from array


// public class ArrayDS {
//     public static void main(String[] args) {
//         int [] arr = {22,13, 45, 23, 45, 68};

//         int ans = 0;
//         for(int i = 0; i<arr.length; i++){
//             if(ans<arr[i]){
//                 ans = arr[i];
                
//             }
//         }
//         System.out.println("max = " +ans);
//     }
    
// }




//SUM OF ALL ELIMENT ARRAY



// public class ArrayDS{
//     public static void main(String[] args) {
//         int[] arr= { 2, 3, 4,5 };
//         int sum = 0;

//         for(int i = 0; i<arr.length; i++){
//             sum = sum + arr[i];

//         }
//         System.out.println("sum= "+ sum);
//     }
// }




// SEARCH ELEM IN ARRAY IF PRESENT RETUN INDEX NO , OTHERWIASE PRINT -1



// public class ArrayDS{
//     public static void main(String[] args) {
//         int [] arr = {12, 34, 5, 78};
        

//         int x = 88;   // 78 serch karna hai

//         int ans = -1;   // let us initially no is not presnt
//         for(int i =0; i<arr.length; i++){
//             if(arr[i] == x){
//                 ans = i;
//                 break;

//             }

//         }
//         if (ans == -1){
//             System.out.println("Number is not found");
//         }
//         else{
//             System.out.println("found" +x +" at index no - " + ans);
//         }
       
//     }
// }





// traversing of 2D arry


// public class ArrayDS{
//     public static void main(String[] args) {
//         int [] [] arr = {   {1,2,3},
//                              {2,5,6}     };


//         // for(int i=0; i<2; i++){
//         //     for(int j= 0; j<3; j++){
//         //         System.out.println(arr[i][j]);
//         //     }
//         // }

//         // 2nd way

//         for(int i =0; i<arr.length; i++){         // for array
//             for(int j = 0; j<arr[i].length; j++){     // for elemnt of array
//                 System.out.println(arr[i][j]);
//             }
//         }




//     }
// }





// taking inpiut array from useer



// public class ArrayDS{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.println("Enter the size of array");
//         int a = sc.nextInt();
//         int [] arr = new int [a];

//         System.out.println("Enter "+ a + " Element ");
        

//         for(int i= 0; i<a; i++){
//             arr[i] = sc.nextInt();
            
//         }

//         for(int i = 0; i<a; i++ ){
//             System.out.print(arr[i] + " ");
//         }

//     }
// }



// not working


// public class ArrayDS{
//     public static void main(String[] args) {
       
//         int [] arr1 = { 12, 34, 56};
        


//        int [] arr2 = arr1.clone();     // aaray1 ko array 2 me copy kiya gaya
             
//       //clone - array2 me jo array1 copy hua ha , array2 ko change karne par 
//       // array 1 change n hoga
      
//        //int [] arr2 = Arrays.copyOf(arr1, arr1.length) ; 

//        // ya clone ya upar wala arrays copy of
       
        
//         // for(int i = 0; i<arr2.length; i++){
//         //     System.out.print(arr2[i] + " ");
//         // }

//        // chanching some value of array2

//         arr2[0] = 23;
//         arr2[1] = 12;

//         System.out.println("array before changing"); // arra y 2 ko change karne par array 1 bhi change

//         for(int i = 0; i<arr1.length; i++){
//             System.out.print(arr1[i] + " ");
//         }


//         System.out.println("After changing arr2");

//         for(int i = 0; i<arr2.length; i++){
//             System.out.print(arr2[i] + " ");
//         }

//     }
// }



// how much times a aray element present 


// public class ArrayDS{
//     static int  Occurance(int [] arr , int x){
//         int count =0; 
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] == x){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int  [] arr = { 23, 45, 67,23, 23, 23,23};
//         System.out.println("COUNT  OF X IS " + Occurance(arr, 23));
        
//     }
// }


// if  a number given then what is the last occurance in array



// public class ArrayDS{
//     static int lastOccurance(int[] arr, int x){
//         int lastIndex = -1;
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i]==x){
//                 lastIndex = i;
//             }
//         }
//         return lastIndex;
//     }
//     public static void main(String[] args) {
//         int [] arr =  { 12, 3,4, 56, 12, 12, 12,3};
//         System.out.println("Last occurasnce of x is  " + lastOccurance( arr, 3));
        
//     }
// }





// count no of elemnts strictly greater than value of x in array




// public class ArrayDS{
//     static int  Occurance(int [] arr , int x){
//         int count =0; 
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] > x){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int  [] arr = { 23, 45, 67,23, 999,56,23, 23,23};
//         System.out.println("value of x graeter than 23 is  " + Occurance(arr, 23));
        
//     }
// }



// check array is sorted or not


// public class ArrayDS{

//     static boolean IsSorted(int[] arr ,int x){
//         boolean check = true;

//         for(int i = 1; i<arr.length; i++){
//             if(arr[i] < arr[i-1]){
//                 check =  false;
//                 break;
//             }
//         }
//         return check;
//     }
//     public static void main(String[] args) {
//         int [] arr = { 2,3,4,5,6, 8};
//         System.out.println(IsSorted(arr , 0));
        
//     }
// }





// find largest & smallest element from arry



// public class ArrayDS{

//     static int[] SmalllestLargest(int[] arr){     // int[] -- return array
//         Arrays.sort(arr);                          // method for sort array
//         int [] ans = { arr[0], arr[arr.length-1]};
//         return ans;
//     }
//     public static void main(String[] args) {
//         int [] arr= { 12, 45, 22 ,11 ,68, 10};
//         int [] ans = SmalllestLargest(arr);
        
//         System.out.println("Smallest " + ans[0]);// sorted me 0 index wala small
//         // sorted me last wala big
//         System.out.println("Largest " + ans[1]);  // nahi samjh aaya
        
//     }
// }




// if target 7 then sum of array number is 7 in how many times
//find pair of number whose sum is seven in array


// public class ArrayDS{
//     static int TargetSum(int []arr, int target){
//         int ans = 0; 
//         for(int i = 0; i<arr.length; i++){
//             for(int j= i+1;j<arr.length; j++){
//                 if (arr[i] + arr[j] == target){
//                     ans++;
//                 }
//             }
//         }
//         return ans;
//     }
    
//     public static void main(String[] args) {
//         int [] arr = { 2,4,5, 6, 1 };
//         System.out.println(TargetSum(arr, 7));
        
//     }
// }






// public class  ArrayDS{


// // find first repeting number
// // code is not working. why i dont know

//     static int FIrstRepetingNumber(int[]arr){
//         for(int i = 0; i<arr.length; i++){    // for1st element
//             for(int j= i+1; j<arr.length; j++){   // for2nd elem
//                 if(arr[j] == arr[i]){    // ans found
//                     return arr[i];

//                 }
//             }
//         }
//         return -1;     // if elemntis not present the return -1
//     }



// //find max elem
    
//     static int MaxValue(int[] arr){
//         int max = Integer.MIN_VALUE;

//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] >max){
//                 max = arr[i];

//             }

//         }
//         return max;
//     }

// // find second max



//    static int secondMax(int[] arr){
//     int max = MaxValue(arr);
    
//     for(int i = 0; i<arr.length ; i++){
//         if(arr[i]==max){
//             arr[i]= Integer.MIN_VALUE;

//         }
//     }

//     int secondMax = MaxValue(arr);
//     return secondMax;
//    }



// // find those elemnt whose presence in once time in array



//     static int unique(int [] arr){
       
//         for(int i = 0; i<arr.length; i++){
//             for(int j= i+1; j<arr.length ; j++){
//                 if(arr[i] == arr[j]){
//                     arr[i] = -2;    // kuch bhi - me man  sakte hai
//                     arr[j] = -2;
//                 }
//             }
//         }
//         int ans = -1;
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i]!= -2)
//             ans = arr[i];

//         }
//         return ans;
//     }


// //find  3 pair of number whose sum is 12 in array



//     static int TripleSum(int [] arr, int target){
//         int count = 0;
        

//         for(int i = 0; i<arr.length; i++){
//             for(int j = i+1; j<arr.length; j++){
//                 for(int k = j+1; k<arr.length; k++){
//                     if(arr[i] + arr[j] +arr[k] == target){
//                         count++;
//                     }
                    
//                 }
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         // int[] arr = { 1,4,5,6,3};
//         //int[] arr = { 1,1,5,6,6};
//         int[] arr = {1,2,3,4,5,6, 6 , 7, 7};

//         System.out.println(TripleSum(arr, 12));


//         System.out.println(unique(arr));

//         System.out.println(secondMax(arr));

//         System.out.println("First repeating no is "+ FIrstRepetingNumber(arr));
        
//     }
// }



// swap without temp usig method

// public class ArrayDS{

//     static void SwapWithoutTemp(int a , int b){
//         a = a+b;
//         b = a-b;
//         a = a-b;
//         System.out.println("The value of after swap");

//         System.out.println("a = " +a);
//         System.out.println("b = "+ b);
        
//     }
//     public static void main(String[] args) {
//        int a = 10; 
//        int b = 20;
//        SwapWithoutTemp(a, b);
       
        
//     }
// }






// public class ArrayDS{

// // reverse array without using another stack


//    static void swap(int [] arr , int i , int j){
//     int temp = arr[i];
//     arr[i] = arr[j];
//     arr[j] = temp;
//    }

//     static void ReverseWithoutStack(int[] arr){
//         int i = 0, j = arr.length-1;

//         while(i<j){
//             swap(arr,i, j);
//             i++;
//             j--;
//         }

//     }


// // reverse array using another stack



//     static  int[] ReverseArr(int[] arr){
//         int n = arr.length;

//         int[] ans = new int[n];

//         int j = 0;

//         for(int i = n-1; i>=0;i--){
//             ans[j++] = arr[i];

//         }
//         return ans;
//     }

// // helping method for print array

//     static  void printArray(int[]arr){
//         for(int i = 0; i<arr.length; i++){
//             System.out.println(arr[i] + " ");
//         }
//         System.out.println();

//     }

   

//     public static void main(String[] args) {
//         int [] arr = {1,2,3,4,5};

//         int[] ans = ReverseArr(arr);
//         for(int i = 0; i<ans.length; i++){
//             System.out.print(ans[i] + " ");
//         }
        
        
//     }
    
// }


// swapping of array using without  another stack



// public class ArrayDS{
//     static void Swap(int[] arr , int i , int j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void ReverseArr( int [] arr){
       
//         int i = 0 , j= arr.length-1;

//         while(i<j){
//             Swap( arr, i, j);
//             i++;
//             j--;
//         }
//     }

    
// // helping method for print array

//     static  void printArray(int[]arr){
//         for(int i = 0; i<arr.length; i++){
//             System.out.println(arr[i] + " ");
//         }
       

//     }
//     public static void main(String[] args) {
//         int [] arr = { 1,2,3,4,5};

//         ReverseArr(arr);
//         printArray(arr);

        
            
        
       
        
//     }
// }




// rotation of array


 

// public class ArrayDS{

//     static int[] Rotate(int[] arr , int k){
//         int n = arr.length;
//         k = k % n;
//         int []ans = new int[n] ;
//         int j= 0;

//         for(int i = n-k; i<n; i++){
//             ans[j++] = arr[i];
//         }

//         for(int i = 0; i<n-k; i++){
//             ans[j++] = arr[i];
//         }
//         return ans;

//     }


// // rotaion without extra space



//     static void Swap(int[] arr , int i , int j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             }

//     static void reverse (int[] arr , int i , int j){ // i - start ind,  j- end index
        
//         while(i<j){
//             Swap(arr, i , j);
//                 i++;
//                 j--;
//             }
            
        
//         }
       
//     static void  RotateINplace(int[] arr , int k){
//             int n = arr.length;
//             k = k%n;

//             reverse(arr,0 ,n-k-1);
//             reverse(arr, n-k , n-1);
//             reverse(arr, 0 , n-1);

//         }

       
// // helping method for print array

//     static  void printArray(int[]arr){
//         for(int i = 0; i<arr.length; i++){
//             System.out.println(arr[i] + " ");
//         }
//     }      
//     public static void main(String[] args) {
//         int[] arr = { 1, 2,3 ,4,5};
//         //int[] ans = Rotate(arr, 102);
//         RotateINplace(arr, 102);
//         printArray(arr);


        
//     }
// }





// public class ArrayDS{
    

// // ELEMENT IN ARRAY PRESENT OR NOT

                                    
//     static int[] MakeQuaryArr(int [] arr){
//         int[] freq  = new int[100005];

//         for(int i= 0; i<arr.length ; i++){
//             //freq[arr[i]]++;
//             //OR
//             freq[arr[i]] = freq[arr[i]]+1;
//         }
//         return freq;


//     }
   
//     public static void main(String[] args) {
//        int[] arr = { 1, 2, 3, 4,5}; 
//        int[] freq = MakeQuaryArr(arr);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no of queries, how mant times want to search");
//        int q = sc.nextInt();

//        while(q>0){
//         System.out.println("Enter no to be search");
//         int x = sc.nextInt();

//         if(freq[x]>0){
//             System.out.println("Yes");
//         }
//         else{
//             System.out.println("No");
//         }
//         q--;
//        }
       
        
//     }
// }







































